import java.util.*;

public class Adam_no 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        int sq = n * n ;

        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        int rev_sq = rev * rev;
        int rev_sq_rev = 0; 
        while (rev_sq != 0) {
            rev_sq_rev = rev_sq_rev * 10 + rev_sq % 10;
            rev_sq /= 10;
        }
        if (sq == rev_sq_rev) {
            System.out.println("The no. is an Adam no.");
        } else {
            System.out.println("The no. is not an Adam no.");
        }
    }    
    
}
