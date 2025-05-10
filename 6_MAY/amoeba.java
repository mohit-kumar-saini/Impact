import java.util.*;

public class amoeba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of months: ");
        int n = sc.nextInt();
        sc.close();

        if (n < 0) {
            System.out.println("Invalid Input");
        } else if (n == 0) {
            System.out.println("Amoeba Size is: 0");
        } else if (n == 1) {
            System.out.println("Amoeba Size is: 1");
        } else {
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Amoeba Size is: " + b);
        }
    }
}
