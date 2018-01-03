import javax.net.ssl.ExtendedSSLSession;

class SinglyLinkedList
{
    private SinglyNode head;
    private int size;

    public SinglyLinkedList()
    {
        head = null;
    }

    public boolean isEmpty()
    {
        return (head == null);
    }

    public void addToStart(int element)
    {
        if(isEmpty())
        {
            head = new SinglyNode(element);
            return;
        }

        SinglyNode newNode = new SinglyNode(element);
        newNode.setNext(head);
        head = newNode;
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

    public void addElement(int element,int position)
    {
        if(position < 0)
        {
            addToStart(element);
        }

        if(position > size)
        {
            addToEnd(element);
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
            
        }
        size++;

        
        
    }

    public void  display()
    {
        SinglyNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.getData()+" --> ");
            temp = temp.getNext();
        }
    }
}