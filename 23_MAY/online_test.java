import java.util.*;
public class online_test 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second String:");
        String str2 = sc.nextLine();
        System.out.println("Resulting string:");
        for (int i = 0; i < str2.length(); i++) 
        {
            char ch = str2.charAt(i);
            if (str1.indexOf(ch) == -1) 
            { 
                System.out.print(ch);
            }
        }
        sc.close();
    }
}
