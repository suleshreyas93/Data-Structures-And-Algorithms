class ReversalStack
{
    private int maxSize;
    private char[] stack;
    private int top;

    public ReversalStack(int maxSize)
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

    public void push(char w)
    {
        top++;
        stack[top] = w;
    }

    public char pop()
    {
        return stack[top--];
    }

    public char peek()
    {
        return stack[top];
    }
}