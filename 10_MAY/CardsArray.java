import java.util.*;
public class CardsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                  
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        if (pos < 1 || pos > n) 
        {
            System.out.println("Invalid position");
        } 
        else 
        {
            int elem = sc.nextInt(); 
            for (int i = 0; i < n; i++)
            {
                if(i == pos - 1) 
                {
                    System.out.print(elem + " ");
                }   
                System.out.print(arr[i] + " ");
            } 
        }
        sc.close();
    }
}
