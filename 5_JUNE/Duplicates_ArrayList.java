import java.util.*;

public class Duplicates_ArrayList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) 
        {
            nums.add(sc.nextInt());
        }

        ArrayList<Integer> seen = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) 
        {
            int num = nums.get(i);
            if (seen.contains(num)) 
            {
                if (!duplicates.contains(num)) 
                {
                    duplicates.add(num);
                }
            } else 
            {
                seen.add(num);
            }
        }
        System.out.println("Duplicates are: " + duplicates);
        sc.close();
    }
}
