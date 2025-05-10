import java.util.*;

public class Accenture_Div 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        System.out.print("Enter the m: ");
        int m = sc.nextInt();
        sc.close();

        int que = num / m;
        int l = que * m;;
        int h = (que+1) * m;

        int d1 = num - l;
        int d2 = h - num ;

        if(d1 == d2)
        {
            System.out.println(h);
        }
        else if (d1 < d2)
        {
            System.out.println(l);
        }
        else
        {
            System.out.println(h);
        }
   }
}
