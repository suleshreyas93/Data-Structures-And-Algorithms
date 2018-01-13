import javax.net.ssl.ExtendedSSLSession;

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

class DeleteNodes
{
    private Node head;
    private int length;

    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void add(int element, int position)
    {
        //fix the position
        if(position < 0)
        {
            position = 0;
        }

        if(position > length)
        {
            position = length;
        }

        if(isEmpty())
        {
            head = new Node(element);
        }

        else if(position == 0)
        {
            Node newNode = new Node(element);
            newNode.setNextNode(head);
            head = newNode;
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

        length++;
    }

    public void displayList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print("["+temp.getData()+"] --> ");
            temp = temp.getNextNode();
        }
    }
}

class LinkedList2
{
    public static void main(String[] args)
    {
        DeleteNodes nodes = new DeleteNodes();
        nodes.add(1, 0);
        nodes.add(2, 1);
        nodes.add(3, 2);
        nodes.displayList();
    }
}