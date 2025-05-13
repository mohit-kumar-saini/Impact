import java.util.*;
public class onlinegame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int result_array []  = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result_array[index++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result_array[index++] = arr[i];
            }
        }

        System.out.print("Rearranged array: ");
        System.out.print(result_array[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + result_array[i]);
        }
        sc.close();
    }
    
}
