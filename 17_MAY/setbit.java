import java.util.*;

public class setbit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        if ((n & (1 << pos)) != 0) 
        {
            System.out.println("Bit is a set bit.");
        } 
        else 
        {
            System.out.println("Bit is not a set bit.");
        }
        sc.close();
    }    
   
}
