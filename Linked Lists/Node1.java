class Node1
{
    private int data;
    private Node1 next;

    //Initialize new node with value.
    public Node1(int data)
    {
        this.data = data;
    }

    public int getData()
    {
        return this.data;
    }

    public void setNext(Node1 nextNode)
    {
        this.next = nextNode;
    }

    public Node1 getNext()
    {
        return this.next;
    }
}