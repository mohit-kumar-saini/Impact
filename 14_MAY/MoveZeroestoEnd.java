import java.util.Scanner;

public class MoveZeroestoEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            long n = sc.nextLong();
            int rev = 0;
            int count = 0;

            while (n != 0) {
                int rem = (int) (n % 10);
                if (rem == 1) {
                    rev = rev * 10 + rem;
                } else {
                    count++;
                }
                n = n / 10;
            }

            int power = (int) Math.pow(10, count);
            System.out.println(rev * power);
        }

        sc.close();
    }
}
