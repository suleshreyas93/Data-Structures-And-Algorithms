class OddEvenSort
{
    private int[] arr;
    private int size;

    public OddEvenSort(int maxSize)
    {
        arr = new int[maxSize];
        size = 0;
    }

    public void insert(int element)
    {
        arr[size] = element;
        size++;
    }

    public void oddEvenSort()
    {
            boolean isSorted = false; // Initially array is unsorted
        
               while (!isSorted)
               {
                   isSorted = true;
                   int temp =0;
        
                   // Perform Bubble sort on odd indexed element
                   for (int i=1; i<=size-2; i=i+2)
                   {
                       if (arr[i] > arr[i+1])
                       {
                           temp = arr[i];
                           arr[i] = arr[i+1];
                           arr[i+1] = temp;
                           isSorted = false;
                       }
                   }
        
                   // Perform Bubble sort on even indexed element
                   for (int i=0; i<=size-2; i=i+2)
                   {
                       if (arr[i] > arr[i+1])
                       {
                           temp = arr[i];
                           arr[i] = arr[i+1];
                           arr[i+1] = temp;
                           isSorted = false;
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