class SinglyNode
{
    private SinglyNode next;
    private int data;

    public SinglyNode(int data)
    {
        this.data = data;
        this.next = null;
    }

    public int getData()
    {
        return this.data;
    }

    public void setNext(SinglyNode nextNode)
    {
        this.next = nextNode;
    }

    public SinglyNode getNext()
    {
        return this.next;
    }
}