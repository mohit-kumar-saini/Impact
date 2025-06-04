// import java.util.*;

// public class TwoSum_ArrayList 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements in the ArrayList:");
//         int n = sc.nextInt();

//         ArrayList<Integer> nums = new ArrayList<>();

//         System.out.println("Enter the elements of the ArrayList:");
//         for (int i = 0; i < n; i++) 
//         {
//             nums.add(sc.nextInt());
//         }

//         System.out.println("Enter the target sum:");
//         int target = sc.nextInt();

//         for (int i = 0; i < nums.size(); i++) 
//         {
//             for (int j = i + 1; j < nums.size(); j++) 
//             {
//                 if (nums.get(i) + nums.get(j) == target) 
//                 {
//                     System.out.println("Pair found: " + nums.get(i) + " and " + nums.get(j));
//                     System.out.println("Indices: " + i + " and " + j);
//                 }
//             }
//         }
//         sc.close();
//     }
    
// }

// This code finds pairs of numbers in an ArrayList that sum to a given target value with O(n^2) time complexity.

// this below one is the optimized version of the above code with O(n) time complexity

import java.util.*;

public class TwoSum_ArrayList 
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

        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        ArrayList<Integer> visited = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++)
        {
            int current = nums.get(i);
            int complement = target - current;

            if (visited.contains(complement)) 
            {
                int j = nums.indexOf(complement); 
                System.out.println("Pair found: " + complement + " and " + current);
                System.out.println("Indices: " + j + " and " + i);
                sc.close();
                return;
            }

            visited.add(current);
        }

        System.out.println("No pair found.");
        sc.close();
    }
}

