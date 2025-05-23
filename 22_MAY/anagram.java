import java.util.*;

public class anagram 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the String2:");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) 
        {
            System.out.println("Not a Valid Anagram");
        } else 
        {
            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

            if (Arrays.equals(a1, a2)) 
            {
                System.out.println("Valid Anagram");
            } else 
            {
                System.out.println("Not a Valid Anagram");
            }
        }

        sc.close();
    }
    
}
