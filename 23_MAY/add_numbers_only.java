// import java.util.*;

// public class add_numbers_only 
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the alphanumeric String:");
//         String str = sc.nextLine();
//         int sum = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (Character.isDigit(ch)) {
//                 sum += ch - '0'; 
//             }
//         }

//         System.out.println("Sum of digits: " + sum);

//         sc.close();
//     }
    
// }


import java.util.*;

public class add_numbers_only {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphanumeric String:");
        String str = sc.nextLine();

        int sum = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                temp += ch;  
            } else {
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp); 
                    temp = ""; 
                }
            }
        }

        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }

        System.out.println("Sum of numbers: " + sum);
        sc.close();
    }
}
