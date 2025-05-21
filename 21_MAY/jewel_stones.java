import java.util.*;

public class jewel_stones 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the jewels: ");
        String jewels = sc.nextLine();
        System.out.print("Enter the stones: ");
        String stones = sc.nextLine();
        
        int jewelCount = 0;
        for (char stone : stones.toCharArray()) 
        {
            if (jewels.indexOf(stone) != -1) 
            {
                jewelCount++;
            }
        }
        
        System.out.println("Number of jewels in stones: " + jewelCount);
        sc.close();
    }
    
}
