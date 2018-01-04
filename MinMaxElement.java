class MinMaxElement
{
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,7,2,4,6,8};
        System.out.print("Array = ");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        int max = arr[1];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Max = "+max);
        
    }
}