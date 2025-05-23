import java.util.*;

public class wordakshari 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String prev = sc.nextLine();

        System.out.println(prev);

        while(true)
        {
            System.out.print("Enter a string: ");
            String curr = sc.nextLine();

            if (curr.equals("####")) 
            {
                break;
            }

            char lastChar = prev.charAt(prev.length() - 1);
            char firstChar = curr.charAt(0);

            if (lastChar == firstChar) 
            {
                System.out.println(curr);
                prev = curr; 
            } 
            else 
            {
                break;
            }
        }
        sc.close();
    }   
}
