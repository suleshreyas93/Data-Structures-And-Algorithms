class PriorityQueue1
{
    private int maxSize;
    private int[] arr;
    private int items;

    public PriorityQueue1(int maxSize)
    {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        items = 0;
    }

    public boolean isEmpty()
    {
        if(items == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isFull()
    {
        if(items == maxSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void insert(int item)
    {
        if(isEmpty())
        {
            arr[items] = item;
        }

        if(isFull())
        {
            System.out.println("queue is full");
        }

        int j;
        for(j = items - 1; j >= 0; j--)
        {
            if(item > arr[j])
            {
                arr[j + 1] = arr[j];
            }
            else
            {
                break;
            }
        }
        arr[j + 1] = item;
        items++;
    }

    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        return arr[--items];
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
        }
        return arr[items];
    }
}