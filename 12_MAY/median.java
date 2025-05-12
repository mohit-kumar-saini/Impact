import java.util.*;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        System.out.print("Sorted array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        double median;
        int totalLength = m + n;
        if (totalLength % 2 == 0) {
            median = (nums1[totalLength / 2 - 1] + nums1[totalLength / 2]) / 2.0;
        } else {
            median = nums1[totalLength / 2];
        }

        System.out.println("\nMedian: " + median);

        int medianInt = (int) median;
        String medianStr = String.valueOf(medianInt);
        System.out.print("Digits in median: ");
        for (char c : medianStr.toCharArray()) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
