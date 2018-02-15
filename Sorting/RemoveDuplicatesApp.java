import java.util.*;
class RemoveDuplicatesApp
{
    public static void main(String[] args)
    {
        int size;
        int element;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        size = scan.nextInt();

        System.out.println();

        RemoveDuplicates rd = new RemoveDuplicates(size);

        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter element at position "+(i + 1)+" : ");
            element = scan.nextInt();
            rd.insert(element);
            System.out.println();
        }

        System.out.print("Array Before sorting : ");
        rd.display();

        System.out.print("Array After sorting : ");
        rd.insertionSort();
        rd.display();
    }
}