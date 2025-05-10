import java.util.*;

public class Trendy_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        int m = (n % 100)/10;
        if(n >= 100 && n <= 999 && m % 3 == 0)
        {
            System.out.println("The no. is a Trendy no.");
        }
        else
        {
            System.out.println("The no. is not a Trendy no.");
        }
    }  
}
