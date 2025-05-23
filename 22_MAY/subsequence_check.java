import java.util.*;

public class subsequence_check 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1:");
        String s = sc.nextLine();
        System.out.println("Enter the String2:");
        String t = sc.nextLine();
        // int n = s.length();
        // int m = t.length(); 
        // int i = 0, j = 0;
        // while (i < n && j < m) {
        //     if (s.charAt(i) == t.charAt(j)) {
        //         j++;
        //     }
        //     i++;
        // }
        // if (j == m) {
        //     System.out.println("String2 is a subsequence of String1");
        // } else {
        //     System.out.println("String2 is not a subsequence of String1");
        // }
        // sc.close();

        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length())
        {
            if(s.charAt(i) == t.charAt(j))
            {
                j++;
            }
            i++;
        }
        if (j == t.length())
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
        sc.close();
    }
    
}