import java.util.*;

public class count_of_vowels 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int count = 0;
        // for (int i = 0; i < str.length(); i++)
        // {
        //     char ch = str.charAt(i);
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        //         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        //     {
        //         count++;
        //     }
        // }

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1)
            {
                count++;
            }
        }


        System.out.println("Number of vowels in the string: " + count);
        sc.close();
    }
    
}


