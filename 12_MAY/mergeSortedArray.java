import java.util.*;

public class mergeSortedArray
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums1 = new int[n];
        int[] nums2 = new int[m];

        for (int i = 0; i < n; i++) 
        {     
            nums1[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++)
        {
            nums2[i] = sc.nextInt();
        }

        int i = 0, j = 0, k = 0;
        int[] nums3 = new int[m + n];

        while (i < n && j < m) 
        {
            if (nums1[i] <= nums2[j])
            {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        while (i < n) 
        {
            nums3[k++] = nums1[i++];
        }

        while (j < m) 
        {
            nums3[k++] = nums2[j++];
        }

        System.out.println("Sorted array: ");
        for (int l = 0; l < m + n; l++) 
        {
            System.out.print(nums3[l] + " ");
        }

        sc.close();
    }
}
