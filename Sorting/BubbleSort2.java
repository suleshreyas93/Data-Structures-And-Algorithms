class BubbleSort2
{
    private int[] arr;
    private int size;

    public BubbleSort2(int maxSize)
    {
        arr = new int[maxSize];
        size = 0;
    }

    public void insert(int element)
    {
        arr[size] = element;
        size++;
    }

    public void bubbleSort()
    {
        int outer, inner;
        for(outer = size - 1; outer > 0; outer--)
        {
            for(inner = 0; inner < outer; inner++)
            {
                if(arr[inner] > arr[inner + 1])
                {
                    int temp = arr[inner];
                    arr[inner] = arr[inner + 1];
                    arr[inner + 1] = temp;
                }
            }
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