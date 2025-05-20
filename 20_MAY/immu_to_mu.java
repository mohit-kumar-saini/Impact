public class immu_to_mu 
{
    public static void main(String[] args) 
    {
        String str = "Parul University";
        String variable = "events";
        
        StringBuilder vamc = new StringBuilder(str);
        StringBuilder vamsi = new StringBuilder(variable);

        // conversion of String from immutable to mutable

        System.out.println(vamc.append(" is a university"));
        System.out.println(vamsi.append(" are conducted by Parul University"));
        System.out.println(str.concat(" Batch - 9"));
         

    }    
}
