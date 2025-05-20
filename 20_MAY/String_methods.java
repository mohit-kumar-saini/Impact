public class String_methods 
{
    public static void main(String[] args) 
    {
        String str = "Parul University";
        String str1 = new String("Parul University");
        String str2 = new String("Parul University");

        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Substring from index 6: " + str.substring(6));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());
        System.out.println("Trimmed string: " + str.trim());
        System.out.println("String starts with 'Parul': " + str.startsWith("Parul"));
        System.out.println("String ends with 'University': " + str.endsWith("University"));
        System.out.println("String contains 'University': " + str.contains("University"));
        System.out.println("String replaced 'Parul' with 'XYZ': " + str.replace("Parul", "XYZ"));
        System.out.println("String split by space: ");
        System.out.println("Compare str and str1: " + str.compareTo(str1));
        System.out.println("Compare str and str1: " + str1.equals(str2));
        System.out.println("Compare str1 and str2: " + str1.equals(str2));
    }    
}
