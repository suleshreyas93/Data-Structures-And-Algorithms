class Node
{
    private int data;
    private Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    public int getData()
    {
        return this.data;
    }

    public void setNextNode(Node nextNode)
    {
        this.next = nextNode;
    }

    public Node getNextNode()
    {
        return this.next;
    }
}

class LinkedList
{
    private Node head;
    private Node tail;
    private int size;

    public LinkedList()
    {
        size = 0;
        head = null;
        tail = null;
    }

    public boolean isEmpty()
    {
        return (head == null);
    }

    public void addFirst(int element)
    {
        if(isEmpty())
        {
            head = new Node(element);
            tail = head;
        }
        else
        {
            Node newNode = new Node(element);//Make new node;
            newNode.setNextNode(head);//Make the new node point to the current head;
            head = newNode;//make new node as the head node;
        }
        size++;
    }

    public void displayList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print("["+temp.getData()+"] -- > ");
            temp = temp.getNextNode();
        }
    }
}

class SinglyLinkedListWithHeadAndTail
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);

        list.displayList();
    }
}