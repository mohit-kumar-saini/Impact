import java.util.*;

public class Missing_no_ArrayList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements (n):");
        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            nums.add(sc.nextInt());
        }

        ArrayList<Integer> missingNumbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) 
        {
            if (!nums.contains(i)) 
            {
                missingNumbers.add(i);
            }
        }

        if (missingNumbers.isEmpty()) {
            System.out.println("No missing numbers in the range 1 to " + n);
        } else {
            System.out.println("Missing numbers in the range 1 to " + n + ":");
            for (int i = 0; i < missingNumbers.size(); i++)
            {
                System.out.println(missingNumbers.get(i));
            }
        }

        sc.close();
    }
}
