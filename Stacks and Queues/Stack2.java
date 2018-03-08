class Stack2
{
    private int maxSize;
    private char[] stack;
    private int top;

    public Stack2(int maxSize)
    {
        this.maxSize = maxSize;
        stack = new char[maxSize];
        top = -1;
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == maxSize - 1);
    }

    public void push(char ch)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
        }

        top++;
        stack[top] = ch;
    }

    public char pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }

        return stack[top--];
    }

    public char peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }

        return stack[top];
    }
}