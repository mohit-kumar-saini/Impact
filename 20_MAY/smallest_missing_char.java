import java.util.*;

public class smallest_missing_char 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // boolean[] present = new boolean[26];

        // for (int i = 0; i < str.length(); i++) 
        // {
        //     char ch = str.charAt(i);
        //     if (ch >= 'a' && ch <= 'z') 
        //     {
        //         present[ch - 'a'] = true;
        //     } 
        //     else if (ch >= 'A' && ch <= 'Z') 
        //     {
        //         present[ch - 'A'] = true;
        //     }
        // }

        // char missingChar = ' ';
        // for (int i = 0; i < present.length; i++) 
        // {
        //     if (!present[i]) 
        //     {
        //         missingChar = (char) (i + 'a');
        //         break;
        //     }
        // }

        // System.out.println("Smallest missing character: " + missingChar);

        String alphabets = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabets.length(); i++) 
        {
            char ch = alphabets.charAt(i);
            if (str.indexOf(ch) == -1) 
            {
                System.out.println("Smallest missing character: " + ch);
                break;
            }
        }
        sc.close();
    }
    
}
