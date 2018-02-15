import java.util.*;
class InsertionSortAnalysisApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        InsertionSortAnalysis isa = new InsertionSortAnalysis(size);

        System.out.println();
        int element = 0;

        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter element at position "+(i)+" : ");
            element = scan.nextInt();
            isa.insert(element);
            System.out.println();
        }

        System.out.println();
        System.out.print("Array before sorting : ");
        isa.display();
        System.out.println();
        System.out.print("Array after sorting : ");
        isa.insertionSort();
        isa.display();

        
    }
}