import javax.net.ssl.ExtendedSSLSession;

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

    public void addLast(int element)
    {
        if(isEmpty())
        {
            head = new ListNode(element);
        }
        else
        {
            ListNode p,q;
            for(p = head; (q = p.getNextNode()) !=null; p=q);//traverse to the end of the list.
            ListNode newNode = new ListNode(element);//Make new node.
            p.setNextNode(newNode);//make current last node point to the new node. So now new node is the last node.

        }
        size++;
    }

    public void addAtPosition(int element, int position)
    {
        //fix the position
        if(position < 0)
        {
            position = 0;
        }

        if(position > size)
        {
            position = size;
        }

        if(isEmpty())
        {
            head = new ListNode(element);
        }

        else if(position == 0)
        {
            ListNode newNode = new ListNode(element);//Make new node;
            newNode.setNextNode(head);//Point it to the current head node;
            head = newNode;//Make new node as the head;
        }

        else
        {
            ListNode temp = head;
            for(int i = 1; i < position; i++)
            {
                temp = temp.getNextNode();
            }

            ListNode newNode = new ListNode(element);//Make new node;
            newNode.setNextNode(temp.getNextNode());
            temp.setNextNode(newNode);
        }
        size++;
    }

    public ListNode removeFirst()
    {
        if(isEmpty())
        {
            return null;
        }
        
        ListNode temp = head; //Make temp point to the current head. Head now has two pointers;
        head = temp.getNextNode();//Make head point to the node next to it;Now head is actually the second node.
        size--;
        return temp;

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
        list.addLast(4);
        list.addAtPosition(2, 0);
        list.addFirst(1);
        list.addAtPosition(5, 5);

        ListNode first = list.removeFirst();
        System.out.println("Removed Node = "+first.getData());
        list.displayList();
        System.out.println("\nLength = "+list.getSize());

    }
}