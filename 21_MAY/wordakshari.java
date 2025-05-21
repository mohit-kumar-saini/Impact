import java.util.*;

public class wordakshari 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        sc.close();
    }
    
}
