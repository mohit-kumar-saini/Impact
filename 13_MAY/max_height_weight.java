import java.util.*;

public class max_height_weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        int[] arr = new int[n * 2];

        for (int i = 0; i < n * 2; i++) {
            arr[i] = sc.nextInt();
        }

        int max_height = arr[0];
        int max_weight = arr[1];
        int max_height_index = 0;
        int max_weight_index = 0;

        for (int i = 0; i < n; i++) {
            int height = arr[2 * i];
            int weight = arr[2 * i + 1];

            if (height > max_height) {
                max_height = height;
                max_height_index = i;
            }

            if (weight > max_weight) {
                max_weight = weight;
                max_weight_index = i;
            }
        }

        System.out.println("Max height: " + max_height + " Person no: " + (max_height_index + 1));
        System.out.println("Max weight: " + max_weight + " Person no: " + (max_weight_index + 1));

        sc.close();
    }
}
