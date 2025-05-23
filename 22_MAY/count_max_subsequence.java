import java.util.*;

public class count_max_subsequence 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        int n = str.length();
        long count = (long) Math.pow(2, n); 

        System.out.println("Maximum possible subsequences (including empty): " + (count - 1) );
        sc.close();
    }
    
}
