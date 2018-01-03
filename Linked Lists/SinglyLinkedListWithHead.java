class LinkedListWithHead
{
    private int size;
    private Node1 head;

    public LinkedListWithHead()
    {
        size = 0;
        head = null;
    }

    public boolean isEmpty()
    {
        return (head == null);
    }

    //Add node at the beginning of linked list
    public void addToStart(int element)
    {
        
        //if the list is empty make head as the new node.
        if(isEmpty())
        {
            head = new Node1(element);
            size++;
            return;
        }

        Node1 newNode = new Node1(element); //Make a new node.
        newNode.setNext(newNode); // Point it to the current head node.
        head = newNode; // make new node as the head.
        size++;
    }

    //Add node at the end of the list.
    public void addToEnd(int element)
    {
        //If the list is empty head will be the first and last element. 
        if(isEmpty())
        {
            head = new Node1(element);
            size++;
            return;
        }

        Node1 i,j;

        //traverse to the end of the list. 
        for(i = head; (j = i.getNext()) != null; i = j); 

        
        Node1 newNode = new Node1(element); //Make a new node.
        i.setNext(newNode); // Point the last node to the new node.
        size++;
    }

    public void addElement(int element, int position)
    {
        if(isEmpty())
        {
            addToStart(element);
            return;
        }


        if(position == 0)
        {
            addToStart(element);
            return;
            
        }

        if(position < 0)
        {
            position = 0;
        }

        else if(position >= size)
        {
            addToEnd(element);
            
        }
        else
        {
            System.out.println("Position = "+position);
            Node1 temp = head;
            for(int i = 0; i < position; i++)
            {
                temp = temp.getNext();
            }

            Node1 newNode = new Node1(element);
            System.out.println("Head's Next = "+temp.getNext().getData());
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            
            size++;
        }

        
            
        


    }

    public void displayList()
    {
        Node1 current = head;

        while(current != null)
        {
            System.out.print("{"+current.getData()+"} --> ");
            current = current.getNext();
        }
    }
}//End of class LinkedListWithHead


//Entry Point
class SinglyLinkedListWithHead
{
    public static void main(String[] args)
    {
        LinkedListWithHead list = new LinkedListWithHead();
        list.addToStart(3);
        list.addToEnd(4);
        list.addElement(2, 0);
        list.displayList();;
    }
}