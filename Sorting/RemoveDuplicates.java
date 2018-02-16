class RemoveDuplicates
{
    private int[] arr;
    private int size;
    private int count;

    public RemoveDuplicates(int maxSize)
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
        int out,temp,in;
        int comparisons = 0;
        int copies = 0;
        boolean isInserted = false;
        count = 0;
        

        for(out = 1; out < size; out++)
        {
            boolean isDuplicate = false;
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
                else if(arr[in - 1] == temp)
                {
                    isDuplicate = true;
                    break;
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
                isInserted = false;
                copies++;
            }

            if(isDuplicate)
            {
                
                arr[in - 1] = -1;
                count++;
            }
        //    arr[in] = temp;
        //    copies++;
                
            
            
            
        }

        System.out.println("Total Comparisons = "+comparisons);
        System.out.println("Total Copies = "+copies);
        System.out.println("Count of duplicates = "+count);
        //int ptr = count;
        for(int i = 0; i < size - count; i++)
        {
            arr[i] = arr[count + i];
            //System.out.print(arr[i]+" ");
            
        }
        
    }

    /*public void dups(int dups)
    {

    }*/

    public void display()
    {
        for(int i = 0; i < size - count; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}