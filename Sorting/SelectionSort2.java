class SelectionSort2
{
    private int[] arr;
    private int size;

    public SelectionSort2(int maxSize)
    {
        arr = new int[maxSize];
        size = 0;
    }

    public void insert(int element)
    {
        arr[size] = element;
        size++;
    }

    public void selectionSort()
    {
        int out,in,min;
        for(out = 0; out < size; out++)
        {
            min = out;
            for(in = out + 1; in < size; in++)
            {
                if(arr[in] < arr[min])
                {
                    min = in;
                }
            }

            int temp = arr[out];
            arr[out] = arr[min];
            arr[min] = temp;
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