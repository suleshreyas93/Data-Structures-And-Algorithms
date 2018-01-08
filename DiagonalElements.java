import java.util.*;
class DiagonalElements
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int rows = 0;
        int cols = 0;
        System.out.print("Enter the number of rows : ");
        rows = scan.nextInt();
        
        System.out.print("\nEnter number of columns : ");
        cols = scan.nextInt();

        int[][] arr = new int[rows][cols];
        if(rows != cols)
        {
            System.out.println("Rows not equal to columns");
        }

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print("Enter element at position "+(i + 1)+","+(j + 1)+" : ");
                arr[i][j] = scan.nextInt();
                System.out.println();
            }
        }

        System.out.println("Matrix = ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Primary Diagonal = ");
        int primarySum = 0;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(i == j)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(i == j)
                {
                    primarySum += arr[i][j];
                }
            }
        }
        System.out.print("\nPrimary Diagonal Sum = "+primarySum);

        
        int secondarySum = 0;
        for(int i = 0; i < rows; i++)
        {
            System.out.print(arr[i][rows - 1 - i]+" ");
        }
        System.out.println("\nSecondary Diagonal = "+secondarySum);

        System.out.print("\nSecondary Diagonal Sum = ");
        for(int i = 0; i < rows; i++)
        {
            secondarySum += arr[i][rows - 1 - i];
        }

        
        int sumOfDiagonals = Math.abs(primarySum) + Math.abs(secondarySum);
        System.out.println("\nSum of diagonals = "+sumOfDiagonals);
        System.out.println("Size = "+arr.length);
    }
}