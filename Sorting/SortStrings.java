class SortStrings
{
    private String[] arr;
    private int size;

    public SortStrings(int maxSize)
    {
        arr = new String[maxSize];
        size = 0;
    }

    public void insert(String city_names)
    {
        arr[size] = city_names;
        size++;
    }

    public void quickSort()
    {
        quickSort(arr,0,arr.length - 1);
    }

    public void quickSort(String[] A, int start, int end)
    {
        if(start < end)
        {
            int pIndex = partition(A, start, end);

            quickSort(A,start,pIndex - 1); //sort to the left of pivot
            quickSort(A,pIndex + 1,end); // sort to the right of pivot
        }
    }

    public int partition(String[] A, int start, int end)
    {
        String pivot = A[end];
        int pIndex = start;

        for(int i = start; i < end; i++)
        {
            if(A[i].compareToIgnoreCase(pivot) < 0)
            {
                String temp = A[pIndex];
                A[pIndex] = A[i];
                A[i] = temp;
                pIndex++;
            }
        }

        String temp = A[pIndex];
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