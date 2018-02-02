class RecursiveArraySum
{
    public static void main(String[] args)
    {
        int[] arr = {1,1,1,1,1};
        int sum = arraySum(arr,0,0);
        System.out.println("Sum of array elements = "+sum);
    }

    public static int arraySum(int[] A, int i, int sum)
    {
        int add = sum;
        if(i >= A.length)
        {
            return add;
        }
        else
        {
            add = add + A[i];
            return arraySum(A, i + 1,add);
        }
        
    }
}