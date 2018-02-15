class InsertionSortAnalysis
{
    private int[] arr;
    private int size;

    public InsertionSortAnalysis(int maxSize)
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
        int comparisons = 0;
        int copies = 0;
        boolean isInserted = false;
        for(out = 1; out < size; out++)
        {
            isInserted = true;
            temp = arr[out];
            
            
            in = out;
            
            while(in > 0)
            {
                comparisons++;
                if(arr[in - 1] > temp)
                {
                    
                    arr[in] = arr[in - 1];
                    
                    
                }
                else
                {
                    break;
                }
                in--;
                
                
                
                
            }
            if(isInserted)
            {
                arr[in] = temp;
                copies++;
                isInserted = false;
            }
            
            
        }
        System.out.println("Total Comparisons = "+comparisons);
        System.out.println("Total Copies = "+copies);
        
    }

    public void display()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}