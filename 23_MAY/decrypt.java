import java.util.*;

public class decrypt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String num = sc.nextLine(); 
        char[] digits = num.toCharArray();
        for (int i = 0; i < digits.length - 1; i += 2) {
            char temp = digits[i];
            digits[i] = digits[i + 1];
            digits[i + 1] = temp;
        }
        System.out.println( new String(digits));
        sc.close();
    }
    
}
