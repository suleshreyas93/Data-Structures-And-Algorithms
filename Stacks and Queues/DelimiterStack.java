class DelimiterStack
{
    private int maxSize;
    private char[] stack;
    private int top;

    public DelimiterStack(int maxSize)
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
        top++;
        stack[top] = ch;
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