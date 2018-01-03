import java.util.*;
class SinglyLinkedListApp
{
    public static void main(String[] args)
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart(3);
        list.addToStart(2);
        list.addToEnd(4);
        list.addElement(1, 2);
        list.display();
    }
}