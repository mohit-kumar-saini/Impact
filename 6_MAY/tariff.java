import java.util.*;

public class tariff
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int m = sc.nextInt();
        System.out.print("Enter the rent per day: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of days: ");
        int d = sc.nextInt();
        sc.close();

        int rent = r * d;

        if ((m >= 4 && m <= 6) || (m >= 11 && m <= 12))
        {
            rent = rent + ((rent * 20) / 100);
            System.out.println("The rent is: " + rent);
        }
        else if (m < 1 || m > 12)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("The rent is: " + rent);
        }

    }
}
