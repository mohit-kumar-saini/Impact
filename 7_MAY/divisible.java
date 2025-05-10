import java.util.Scanner;
public class divisible
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int m = sc.nextInt();
        System.out.print("Enter the number2: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("The no. which are divisible by both 7 and 9 are: ");
        for (int i = m; i <= n; i++) {
            if (i % 7 == 0 && i % 9 == 0) {
                System.out.print(i + " , ");
            }
        }
    }
    
}
