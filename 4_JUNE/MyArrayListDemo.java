import java.util.*;

public class MyArrayListDemo
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayList: " + numbers);

        int firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);

        numbers.set(1, 25);
        System.out.println("After update: " + numbers);

        numbers.remove(1); 
        System.out.println("After removal: " + numbers);
        
    }
}