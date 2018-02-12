class BiDirectionalBubbleSort
{
    private int[] arr;
    private int size;

    public BiDirectionalBubbleSort(int maxSize)
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
        int out,in,out2;
        for(out = size - 1; out > 0; out--)
        {
            for(in = 0; in < out; in++)
            {
                if(arr[in] > arr[in + 1])
                {
                    int temp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;
                }
                
            }
            System.out.println("\n in = "+in);
            display();
            System.out.println();
            for(out2 = in - 1; out2 > 0; out2--)
            {
                //System.out.println("out2 = "+out2);
                if(arr[out2] < arr[out2 - 1])
                {
                    int temp = arr[out2];
                    arr[out2] = arr[out2 - 1];
                    arr[out2 - 1] = temp;
                }
                System.out.println("out2 = "+out2);
                
            }
            display();
            System.out.println();
            
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