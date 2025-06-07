import java.util.*;

public class Vowel_Frequency_HashMap 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> vowelCount = new HashMap<>();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char vowel : vowels) {
            vowelCount.put(vowel, 0);
        }

        for (char ch : input.toCharArray()) {
            if (vowelCount.containsKey(ch)) {
                vowelCount.put(ch, vowelCount.get(ch) + 1);
            }
        }
        System.out.println("Vowel frequencies:");
        for (char vowel : vowels) {
            System.out.println(vowel + " --> " + vowelCount.get(vowel));
        }
        sc.close();
    }
    
}
