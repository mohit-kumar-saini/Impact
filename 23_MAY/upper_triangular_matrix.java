import java.util.*;

public class upper_triangular_matrix 
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

        boolean isUpper = true;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    isUpper = false;
                    break;
                }
            }
            if (!isUpper) break;
        }

        if (isUpper) {
            System.out.println("Upper Triangular Matrix.");
        } else {
            System.out.println("NOT an Upper Triangular Matrix.");
        }

        sc.close();
        





    }
    
}
