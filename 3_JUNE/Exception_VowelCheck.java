import java.util.*;

public class Exception_VowelCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            input = input.toLowerCase();

            if (input.contains("a") || input.contains("e") || input.contains("i") ||
                input.contains("o") || input.contains("u")) 
            {
                System.out.println("The string has vowels.");
            } else 
            {
                System.out.println("The string does not have any vowels.");
            }
        }
        catch (Exception e) 
        {
            System.out.println("Something went wrong: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Vowel checking is done.");
            sc.close();
        }
    }
}
