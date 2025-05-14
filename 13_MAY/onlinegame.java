import java.util.*;

public class onlinegame
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = num - 1;

        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 != 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Array after Segregation:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
