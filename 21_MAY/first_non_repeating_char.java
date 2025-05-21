import java.util.*;

public class first_non_repeating_char 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)) 
            {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
        sc.close();
    }
    
}
