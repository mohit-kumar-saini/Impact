import java.util.*;

public class Two_Sum_HashSet 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();
        
        HashSet<Integer> seen = new HashSet<>();
        boolean found = false;
        for (int i = 0; i < n; i++) 
        {
            int complement = target - arr[i];
            if (seen.contains(complement)) 
            {
                System.out.println("Pair found: " + arr[i] + " and " + complement);
                found = true;
                break; 
            }
            seen.add(arr[i]);
        }
        if (!found) 
        {
            System.out.println("No pair found with the given sum.");
        }

        sc.close();
    }
    
}
