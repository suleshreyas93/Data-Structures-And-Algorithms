/**
 * ListNode class contains the individual nodes with data and pointers to next node.
 */
class ListNode
{
    private int data;
    private ListNode next;

    public ListNode(int data)
    {
        this.data = data;
        next = null;
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
}//End of class ListNode

/**
 * Linked List class is a singly linked list with only head and all other implementation
 * methods such as addFirst, addLast, addAtPosition, removeFirst, removeLast, removeAtPosition
 * and getSize.
 */