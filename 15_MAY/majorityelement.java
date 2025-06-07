// Optimization Approach

import java.util.*;

public class majorityelement
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

        int count = 1;
        int majorityElement = arr[0];
        for (int i = 1; i < n; i++)
        {
            if (arr[i] == majorityElement)
            {
                count++;
            }
            else
            {
                count--;
                if (count == 0)
                {
                    majorityElement = arr[i];
                    count = 1;
                }
            }
        }
        System.out.println("The majority element is: " + majorityElement);
        sc.close();
    }
}            


// Brute force Approach

// import java.util.*;

// public class majorityelement
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         int count = 1;
//         for (int i = 0; i < n; i++)
//         {
//             if (arr[i] == arr[i + 1])
//             {
//                 count++;
//             }
//             else
//             {
//                 count = 1;
//             }
//             if (count == n / 2)
//             {
//                 System.out.println("The majority element is: " + arr[i]);
//                 break;
//             }
//         }
//         sc.close();
//     }  
    
// }

// Normal Approach 

// Arrays.sort(nums);
//         int length = nums.length;
//         int mid = length / 2;
//         return nums[mid];
