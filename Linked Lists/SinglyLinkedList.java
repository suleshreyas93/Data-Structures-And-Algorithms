import javax.net.ssl.ExtendedSSLSession;

class LinkedList
{
    private int size;
    private SinglyNode head;

    public LinkedList()
    {
        head = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        return (head == null);
    }

    public void addToStart(int element)
    {
        //If List is empty..
        if(isEmpty())
        {
            SinglyNode newNode = new SinglyNode(element);
            head = newNode; //make new node as the head.
            return;
        }

        SinglyNode newNode = new SinglyNode(element); //make new node.
        newNode.setNext(head); // point it to current head.
        head = newNode; // make new node as the head.
        size++;
    }

    public void addToEnd(int element)
    {
        if(isEmpty())
        {
            head = new SinglyNode(element);
            return;
        }

        SinglyNode i,j;
        for(i = head; (j = i.getNext()) != null; i = j);

        SinglyNode newNode = new SinglyNode(element);
        i.setNext(newNode);
        size++;
    }

    public void addElement(int element, int position)
    {
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
            addToStart(element);
        }

        else if(position == 0)
        {
            addToStart(element);
        }

        else
        {
            SinglyNode temp = head;
            for(int i = 1; i < position; i++)
            {
                temp = temp.getNext();
            }

            SinglyNode newNode = new SinglyNode(element);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            size++;
        }
    }

    public void displayList()
    {
        SinglyNode temp = head;
        while(temp != null)
        {
            System.out.print("{"+temp.getData()+"} --> ");
            temp = temp.getNext();
        }
    }
}

class SinglyLinkedList
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.addToStart(3);
        list.addToEnd(4);
        list.addToStart(2);
        list.addElement(1, 0);
        list.addElement(5, 20);
        list.displayList();
    }
}