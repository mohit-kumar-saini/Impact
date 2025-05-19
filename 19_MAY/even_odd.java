import java.util.*;;

public class even_odd 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if ((n & 1) == 0) 
        {
            System.out.println(n + " is even");
        } 
        else 
        {
            System.out.println(n + " is odd");
        }
        sc.close();
    }
    
}
