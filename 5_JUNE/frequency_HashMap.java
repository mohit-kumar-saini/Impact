import java.util.*;

public class frequency_HashMap 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of arr:");
        int m = sc.nextInt();

        int[] arr = new int[m];

        System.out.println("Enter " + m + " elements:");
        for (int i = 0; i < m; i++) 
        {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < m; i++) 
        {
            if (frequencyMap.containsKey(arr[i])) 
            {
                int count = frequencyMap.get(arr[i]) + 1;
                frequencyMap.put(arr[i], count);
            } else 
            {
                frequencyMap.put(arr[i], 1);
            }
        }

        System.out.println("Frequencies of elements in the array:\n");

        HashSet<Integer> printed = new HashSet<>();
        for (int i = 0; i < m; i++) 
        {
            int num = arr[i];
            if (!printed.contains(num)) 
            {
                System.out.println(num + " --> " + frequencyMap.get(num));
                printed.add(num);
            }
        }

        sc.close();
    }
}
