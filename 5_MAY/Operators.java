import java.util.Scanner;
public class Operators {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int f = n / 1000; 
        int l = n % 10;

        int sum = f + l;
        System.out.println("The sum of first and last digit is: " + sum);
        sc.close();

    }
}