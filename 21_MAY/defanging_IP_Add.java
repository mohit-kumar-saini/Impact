import java.util.*;

public class defanging_IP_Add 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ip = sc.nextLine();
        String defangedIP = ip.replace(".", "[.]");
        System.out.println("Defanged IP address: " + defangedIP);
        sc.close();
    }
}