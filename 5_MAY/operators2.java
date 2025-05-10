import java.util.*;
public class operators2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int f = n / 100;
        int m = (n % 100)/10;
        int t = n % 10;

        int sum = f + m + t;
        System.out.println("The sum of first and last digit is: " + sum);
        sc.close();
    }
    
}
