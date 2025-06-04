import java.util.*;

public class ContainsDuplicateArrayList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the ArrayList:");
        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Enter the elements of the ArrayList:");
        
        for (int i = 0; i < n; i++) 
        {
            nums.add(sc.nextInt());
        }

        ArrayList<Integer> uniqueNums = new ArrayList<>();
        boolean hasDuplicate = false;

        for (int i = 0; i < nums.size(); i++) 
        {
            if (uniqueNums.contains(nums.get(i))) 
            {
                hasDuplicate = true;
                break;
            }
            uniqueNums.add(nums.get(i));
        }

        if (hasDuplicate) 
        {
            System.out.println("Duplicate element found.");
        } else {
            System.out.println("No duplicate elements found.");
        }
        sc.close();
    }
}
