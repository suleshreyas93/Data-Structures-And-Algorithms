import java.util.*;
class RecursiveArray
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        printArr(arr,0);
    }

    public static void printArr(int[] A, int n)
    {
        if(n >= A.length)
        {
            return;
        }
        else
        {
            System.out.println(A[n]);
            n++;
            printArr(A,n);
        }
    }
}