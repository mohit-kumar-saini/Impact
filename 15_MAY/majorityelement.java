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
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == arr[i + 1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if (count == n / 2)
            {
                System.out.println("The majority element is: " + arr[i]);
                break;
            }
        }
        sc.close();
    }  
    
}
