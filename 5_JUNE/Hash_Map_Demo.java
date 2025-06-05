import java.util.*;

public class Hash_Map_Demo 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Parul");
        map.put(2, "Ankit");
        map.put(3, "Rohit");
        
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.size());
        System.out.println(map.values());
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Ankit"));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(1);
        System.out.println("After removing key 1: " + map);
        map.clear();
        System.out.println("After clearing the map: " + map);
        map.put(4, "New Entry");
        System.out.println("After adding a new entry: " + map);
        map.put(5, "Rahul");
        map.put(6, "Ritesh");
        System.out.println("Map size: " + map.size());
        System.out.println("Iterating through the map:");
        for(int i : map.keySet()) 
        {
            System.out.println("Key: " + i + ", Value: " + map.get(i));
        }
    }
    
}
