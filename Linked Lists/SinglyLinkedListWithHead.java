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
            return;
        }

        Node1 newNode = new Node1(element); //Make a new node.
        newNode.setNext(newNode); // Point it to the current head node.
        head = newNode; // make new node as the head.
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

class SinglyLinkedListWithHead
{
    public static void main(String[] args)
    {
        LinkedListWithHead list = new LinkedListWithHead();
        list.addToStart(3);
        list.displayList();;
    }
}