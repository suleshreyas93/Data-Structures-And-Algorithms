class QuickSort
{
    private int[] arr;
    private int size;

    public QuickSort(int maxSize)
    {
        arr = new int[maxSize];
        size = 0;
    }

    public void insert(int element)
    {
        arr[size] = element;
        size++;
    }

    public void quickSort()
    {
        quickSort(arr,0,arr.length - 1);
    }

    public void quickSort(int[] A, int start, int end)
    {
        if(start < end)
        {
            int pIndex = partition(A,start,end);

            quickSort(A,start,pIndex - 1);
            quickSort(A,pIndex + 1,end);
        }
    }

    public int partition(int[] A, int start, int end)
    {
        int pivot = A[end];
        int pIndex = start;

        for(int i = start; i < end; i++)
        {
            if(A[i] <= pivot)
            {
                int temp = A[pIndex];
                A[pIndex] = A[i];
                A[i] = temp;
                pIndex++;

            }

            
        }
        int temp = A[pIndex];
        A[pIndex] = A[end];
        A[end] = temp;

        return pIndex;
    }

    public void display()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}