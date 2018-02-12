import java.util.*;
class BiDirectionalApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        BiDirectionalBubbleSort sort = new BiDirectionalBubbleSort(size);

        System.out.println();
        int element = 0;

        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter element at position "+(i + 1)+" : ");
            element = scan.nextInt();
            sort.insert(element);
            System.out.println();
        }

        System.out.println();
        System.out.print("Array before sorting : ");
        sort.display();
        System.out.println();
        System.out.print("Array after sorting : ");
        System.out.println();
        sort.bubbleSort();
        sort.display();

        
    }
}