import java.util.*;

public class rotated_matrix 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. of rows and columns:");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n / 2; j++) {
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[i][n - j - 1];
        //         matrix[i][n - j - 1] = temp;
        //     }
        // }


        System.out.println("Matrix after 90° clockwise rotation:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(matrix[n - j -1][i] + " ");
            }
            System.out.println();
        }


        // System.out.println("Matrix after 90° clockwise rotation:");
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
    
}
