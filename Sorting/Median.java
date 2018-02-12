class Median
{
    private int[] arr;
    private int size;


    public Median(int maxSize)
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
        int i,j,temp;
        for(i = 1; i < size; i++)
        {
            temp = arr[i];
            j = i;
            while(j > 0 && arr[j - 1] > temp)
            {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public int medianOfArray()
    {
        int middle = size / 2;
        System.out.println("middle = "+middle);
        if(size % 2 == 0)
        {
            int avg = (arr[middle - 1] + arr[middle])/2;
            return avg;
        }
        else
        {
            
            return arr[middle];
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