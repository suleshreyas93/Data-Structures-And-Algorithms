import javax.net.ssl.ExtendedSSLSession;

class AddNodes
{
    private ListNode head;
    private int length;

    public AddNodes()
    {
        head = null;
    }

    public boolean isEmpty()
    {
        return (head == null);
    }

    public void addFirst(int element)
    {
        if(isEmpty())
        {
            head = new ListNode(element);
            return;
        }

        ListNode newNode = new ListNode(element);
        newNode.setNextNode(head);
        head = newNode;
        length++;
    }

    public void addLast(int element)
    {
        if(isEmpty())
        {
            head = new ListNode(element);
            return;
        }

        ListNode p,q;
        for(p = head; (q = p.getNextNode()) != null; p = q);

        ListNode newNode = new ListNode(element);
        p.setNextNode(newNode);
        length++;

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
            head = new ListNode(element);
        }

        else if(position == 0)
        {
            ListNode newNode = new ListNode(element);
            newNode.setNextNode(head);
            head = newNode;
        }

        else
        {
            ListNode temp = head;
            for(int i = 1; i < position; i++)
            {
                temp = temp.getNextNode();
            }

            ListNode newNode = new ListNode(element);
            newNode.setNextNode(temp.getNextNode());
            temp.setNextNode(newNode);

        }

        length++;
    }

    public int getLength()
    {
        ListNode temp = head;
        int count = 0;

        while(temp != null)
        {
            temp = temp.getNextNode();
            count++;
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
}