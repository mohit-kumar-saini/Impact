import java.util.*;
public class s_two_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = n1 * n2;
        System.out.println("The product of " + n1 + " and " + n2 + " is: " + result);
        sc.close();
    }
}
