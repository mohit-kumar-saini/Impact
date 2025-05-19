import java.util.*;

public class SetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Enter the position of the bit to be set: ");
        int i = sc.nextInt();

        int result = n | (1 << i);

        System.out.printf("Result after setting the %d-th bit: %d\n", i, result);

        sc.close();
    }
}
