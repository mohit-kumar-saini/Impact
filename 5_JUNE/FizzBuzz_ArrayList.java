import java.util.*;

public class FizzBuzz_ArrayList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        ArrayList<String> Fizz_list = new ArrayList<>();

        for (int i = 1; i <= n; i++) 
        {
            if (i % 3 == 0 && i % 5 == 0) 
            {
                Fizz_list.add("FizzBuzz");
            } else if (i % 3 == 0) 
            {
                Fizz_list.add("Fizz");
            } else if (i % 5 == 0) 
            {
                Fizz_list.add("Buzz");
            } else 
            {
                Fizz_list.add(String.valueOf(i));
            }
        }

        System.out.println("FizzBuzz Result:");
        for (int i  = 0; i < Fizz_list.size(); i++) 
        {
            String value = Fizz_list.get(i);    
            System.out.println(value);
        }
        sc.close();
    }
}
