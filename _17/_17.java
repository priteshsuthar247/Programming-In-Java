// import java.util.*;
// public class _17
// {
//     public static void main(String[] args)
//     {
//         Random gen = new Random();
//         int[][] a;
//         a = new int[6][6];
//         for (int i = 0; i < a.length; i++) 
//         {
//             for (int j = 0; j < a.length; j++) 
//             {
//                 a[i][j] = gen.nextInt(2);
//             }
//         }
//         for (int i = 0; i < a.length; i++) 
//         {
//             for (int j = 0; j < a.length; j++) 
//             {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }

//         boolean oddOnRows = true;
//         boolean oddOnCols = true;

//         for (int i = 0; i < a.length; i++) 
//         {
//             int rowSum = 0;
//             int colSum = 0;
//             for (int j = 0; j < a[i].length; j++) 
//             {
//                 rowSum += a[i][j];
//                 colSum += a[j][i];
//             }
//             if (rowSum % 2 == 0) 
//             {
//                 oddOnRows = false;
//             }
//             if (colSum % 2 == 0) 
//             {
//                 oddOnCols = false;
//             }
//         }
//         if (oddOnRows && oddOnCols) 
//         {
//             System.out.println("Every row and column has an odd number of 1's.");
//         }
//         else 
//         {
//             System.out.println("Not every row and column has an odd number of 1's.");
//         }
//     }
// }

// import java.lang.*;
public class _17 
{
    public static int[][] create_fill_matrix() 
    {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                matrix[i][j] = (int) ((Math.random() * 5) % 2);
            }
        }
        return matrix;
    }
    public static void displayMatrix(int[][] matrix) 
    {
        System.out.print("\nMatrix Values \n");
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int my_matrix[][];
        int i, j, cnt;
        my_matrix = create_fill_matrix();
        displayMatrix(my_matrix);
        System.out.println("\nRows Having ODD no of 1s");
        for (i = 0; i < 6; i++) 
        {
            cnt = 0;
            for (j = 0; j < 6; j++) 
            {
                if (my_matrix[i][j] == 1) 
                {
                    cnt++;
                }
            }
            if (cnt % 2 != 0) 
            {
                System.out.println("Row - " + (i + 1) + " have ODD no of 1s");
            }
        }
        System.out.println("\nColumns Having ODD no of 1s");
        for (i = 0; i < 6; i++) 
        {
            cnt = 0;
            for (j = 0; j < 6; j++) 
            {
                if (my_matrix[j][i] == 1) 
                {
                    cnt++;
                }
            }
            if (cnt % 2 != 0) 
            {
                System.out.println("Column - " + (i + 1) + " have ODD no of 1s");
            }
        }
    }
}