import java.util.*;

public class max_min_sum_2d_array 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRow-wise sum, max, and min:");
        for (int i = 0; i < rows; i++) {
            int sum = 0, max = matrix[i][0], min = matrix[i][0];
            for (int j = 0; j < cols; j++) {
                int val = matrix[i][j];
                sum += val;
                if (val > max) max = val;
                if (val < min) min = val;
            }
            System.out.println("Row " + (i + 1) + ": Sum = " + sum + ", Max = " + max + ", Min = " + min);
        }

        System.out.println("\nColumn-wise sum, max, and min:");
        for (int j = 0; j < cols; j++) {
            int sum = 0, max = matrix[0][j], min = matrix[0][j];
            for (int i = 0; i < rows; i++) {
                int val = matrix[i][j];
                sum += val;
                if (val > max) max = val;
                if (val < min) min = val;
            }
            System.out.println("Column " + (j + 1) + ": Sum = " + sum + ", Max = " + max + ", Min = " + min);
        }

        sc.close();
    }
}
