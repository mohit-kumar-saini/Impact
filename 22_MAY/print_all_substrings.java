import java.util.*;

public class print_all_substrings 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        int n = str.length();

        System.out.println("All substrings are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }

        sc.close();
    }
    
}
