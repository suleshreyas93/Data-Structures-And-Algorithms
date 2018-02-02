import java.util.*;
class Transpose
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = scan.nextInt();
        System.out.println();
        System.out.print("Enter number of cols : ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print("Enter element at position "+(i + 1)+" "+(j + 1)+" : ");
                matrix[i][j] = scan.nextInt();
                System.out.println();
            }
        }

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Transpose : ");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }


    }
}