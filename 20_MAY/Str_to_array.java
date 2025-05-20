
public class Str_to_array 
{
    public static void main(String[] args) 
    {
        String str = "Parul University";
        
        char arr[] = str.toCharArray();
        System.out.println("String to char array: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
