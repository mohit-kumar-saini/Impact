import java.util.*;

public class Majority_Element_HashMap 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) 
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

        System.out.println("Majority element in the array:\n");

        int majorityCount = n / 2;
        for (int i : frequencyMap.keySet()) 
        {
            if (frequencyMap.get(i) > majorityCount) 
            {
                System.out.print(i + " is the majority element with frequency: " + frequencyMap.get(i));
                break; 
            }
        }
        {
            
        }
        sc.close();
    }
    
}
