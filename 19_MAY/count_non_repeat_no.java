import java.util.*;

public class count_non_repeat_no 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int num = 0;
        for (int i = 0; i < n; i++) {
            num = num ^ arr[i];
        }
        System.out.println("The non-repeating number is: " + num);
        sc.close();
    }
}    