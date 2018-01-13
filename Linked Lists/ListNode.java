class ListNode
{
    private int data;
    private ListNode next;

    public ListNode(int data)
    {
        this.data = data;
        this.next = null;
    }

    public int getData()
    {
        return this.data;
    }

    public void setNextNode(ListNode nextNode)
    {
        this.next = nextNode;
    }

    public ListNode getNextNode()
    {
        return this.next;
    }
}