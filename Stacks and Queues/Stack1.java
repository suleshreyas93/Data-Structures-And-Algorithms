class Stack1
{
    private int maxSize;
    private int[] arr;
    private int top;

    public Stack1(int size)
    {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty()
    {
        if(top == -1)
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
        if(top == maxSize - 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void push(int element)
    {
        if(isFull())
        {
            System.out.println("Can\'t insert. Stack is full.");
        }
        else
        {
            top++;
            arr[top] = element;
        }
        
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Can\'t pop. Stack is empty.");
        }
        return arr[top--];
        
        
        
    }

    public int peek()
    {
        return arr[top];
    }

}