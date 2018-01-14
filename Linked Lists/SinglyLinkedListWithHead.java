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

class LinkedList
{
    private ListNode head;
    private int size;

    public LinkedList()
    {
        head = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        if(head != null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void addFirst(int element)
    {
        if(isEmpty())
        {
            head = new ListNode(element);

        }
        else
        {
            ListNode newNode = new ListNode(element);//make a new node
            newNode.setNextNode(head);//point to current head
            head = newNode;//Make new node as the head;
        }
        size++;
    }

    public int getSize()
    {
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.getNextNode();
        }
        return count;
    }

    public void displayList()
    {
        ListNode temp = head;
        while(temp != null)
        {
            System.out.print("{"+temp.getData()+"} --> ");
            temp = temp.getNextNode();
        }
    }

}//End of class LinkedList

class SinglyLinkedListWithHead
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.addFirst(3);
        list.displayList();
        System.out.println("\nLength = "+list.getSize());
    }
}