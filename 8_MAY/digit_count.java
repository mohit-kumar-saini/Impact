import java.util.*;
public class digit_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        int temp = n;
        
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        
        System.out.println("Number of digits in " + n + " is: " + count);
    }
    
}
