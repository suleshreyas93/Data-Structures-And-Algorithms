class LinkedList1
{
    public static void main(String[] args)
    {
        AddNodes nodes = new AddNodes();
        nodes.addFirst(3);
        nodes.addLast(4);
        nodes.add(1, 0);
        nodes.add(2,1);
        nodes.add(2,2);

        int length = nodes.getLength();
        
        nodes.displayList();
        System.out.println("\n Length = "+length);
    }
}