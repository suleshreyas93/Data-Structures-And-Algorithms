import java.util.*;
class QuickSortApp
{
    public static void main(String[] args)
    {
        int size;
        int element;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        size = scan.nextInt();

        System.out.println();

        QuickSort qs = new QuickSort(size);

        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter element at position "+(i + 1)+" : ");
            element = scan.nextInt();
            qs.insert(element);
            System.out.println();
        }

        System.out.print("Array Before sorting : ");
        qs.display();

        System.out.print("Array After sorting : ");
        qs.quickSort();
        qs.display();
    }
}