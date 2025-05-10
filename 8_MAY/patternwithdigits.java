import java.util.*;
public class patternwithdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int num = 1;
        sc.close();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
