import java.util.*;

public class ThreeSum_Using_HashSet 
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target sum:");
        int target = sc.nextInt();
        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < n - 1; i++) 
        {
            seen.clear();
            for (int j = i + 1; j < n; j++) 
            {
                int complement = target - nums[i] - nums[j];
                if (seen.contains(complement)) 
                {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet); 
                    result.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        if (result.isEmpty()) 
        {
            System.out.println("No triplet found with the given sum.");
        } else 
        {
            System.out.println("Triplets found:");
            for (List<Integer> triplet : result) 
            {
                System.out.println(triplet);
            }
        }
        System.out.println("Total unique triplets found: " + result.size());
        sc.close();
    }
}
 