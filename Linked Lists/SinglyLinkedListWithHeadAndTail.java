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

    public Node getHead()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            return head;
        }
    }

    public Node getTail()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            return tail;
        }
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

    public void addLast(int element)
    {
        if(isEmpty())
        {
            head = new Node(element);
            tail = head;
        }
        else
        {
            Node p,q;
            for(p = head; (q = p.getNextNode())!=null; p=q);

            Node newNode = new Node(element);
            p.setNextNode(newNode);
            tail = newNode;
        }
        size++;
    }

    public void addElement(int element, int position)
    {
        //fix the position
        if(position < 0)
        {
            addFirst(element);
            return;
        }

        if(position > size)
        {
            addLast(element);
            return;
        }

        if(isEmpty())
        {
            head = new Node(element);
            tail = head;
            
        }

        else if(position == 0)
        {
            addFirst(element);
        }

        else
        {
            Node temp = head;
            for(int i = 1; i < position; i++)
            {
                temp = temp.getNextNode();
            }

            Node newNode = new Node(element);
            newNode.setNextNode(temp.getNextNode());
            temp.setNextNode(newNode);
        }
        size++;
    }

    public int getSize()
    {
        Node temp = head;
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
        list.addLast(3);
        list.addElement(4, 10);

        list.displayList();
        Node head = list.getHead();
        System.out.println("\nHead = "+head.getData());
        Node tail = list.getTail();
        System.out.println("Tail = "+tail.getData());
        int size = list.getSize();
        System.out.println("Size = "+list.getSize());
    }
}