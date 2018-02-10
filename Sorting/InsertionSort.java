class InsertionSort
{
    private int[] arr;
    private int size;

    public InsertionSort(int maxSize)
    {
        arr = new int[maxSize];
        size = 0;
    }

    public void insert(int element)
    {
        arr[size] = element;
        size++;
    }

    public void insertionSort()
    {
        int out,in,temp;
        for(out = 1; out < size; out++)
        {
            temp = arr[out];
            in = out;
            while(in > 0 && arr[in - 1] > temp)
            {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;

        }

    }

    public void display()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}