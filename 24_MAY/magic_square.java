import java.util.*;

public class magic_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int mainDiagonalSum = 0;
        int antiDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];                 
            antiDiagonalSum += matrix[i][n - i - 1];         
        }

        System.out.println("Sum of Main Diagonal: " + mainDiagonalSum);
        System.out.println("Sum of Anti Diagonal: " + antiDiagonalSum);

        if (mainDiagonalSum == antiDiagonalSum) {
            System.out.println("Both diagonals have the same sum.");
        } else {
            System.out.println("Diagonals have different sums.");
        }

        sc.close();
    }
}
