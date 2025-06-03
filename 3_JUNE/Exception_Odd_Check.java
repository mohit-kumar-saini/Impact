import java.util.*;

public class Exception_Odd_Check 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num % 2 != 0) 
            {
                System.out.println(num + " is an odd number.");
            } else 
            {
                System.out.println(num + " is not an odd number.");
            }
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input! Please enter an integer.");
        } 
        catch (Exception e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Odd number check completed.");
            sc.close();
        }
    }
}
