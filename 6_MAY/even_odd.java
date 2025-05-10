import java.util.*;

public class even_odd 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n == 0)
        {
            System.out.println("The no. is 0");
        }
        else if(n % 2 == 0)
        {
            System.out.println("The no. is even");
        }
        else if(n >= 10)
        {
            System.out.println("The no. is not a  single digit no.");
        }
        else 
        {
            System.out.println("The no. is odd");
        } 
        sc.close();
    }
}