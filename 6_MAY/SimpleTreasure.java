import java.util.*;

public class SimpleTreasure
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        sc.close();

        int secondLargest;
        if ((a > b && a < c) || (a > c && a < b)) {
            secondLargest = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            secondLargest = b;
        } else {
            secondLargest = c;
        }
        
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        int code = 1;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                code = i;
                break; 
            }
        }
        System.out.println("Treasure is in the box with number: " + secondLargest);
        System.out.println("Code to open the treasure box is: " + code);
    }
}
