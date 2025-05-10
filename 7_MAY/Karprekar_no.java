import java.util.*;
public class Karprekar_no 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        int square = n * n;
        int countDigits = 0;
        // int temp = square;
        int temp = n;
        while (temp != 0) 
        {
            countDigits++;
            temp /= 10;
        }
        
        // for (int i = 1; i < countDigits; i++) {
            int divisor = (int) Math.pow(10, countDigits );
            int right = square % divisor;
            int left = square / divisor;

            if (right > 0 && left + right == n) {
                System.out.println(n + " is a Karprekar number.");
                return;
            }
        // }

        System.out.println(n + " is not a Karprekar number.");
    }
}


// Commented part is for universal case and the above code is for the specific case of right check with left n and n-1.