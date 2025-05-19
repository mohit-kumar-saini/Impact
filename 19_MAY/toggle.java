import java.util.*;

public class toggle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the position to toggle:");
        int pos = sc.nextInt();
        int result = n ^ (1 << pos);
        System.out.println("The number before toggling: " + result);
        sc.close();
    }
    
}
