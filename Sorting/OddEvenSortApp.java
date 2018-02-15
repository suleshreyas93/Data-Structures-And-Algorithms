import java.io.*;
class OddEvenSortApp
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        OddEvenSort oes = new OddEvenSort(size);

        System.out.println();
        int element = 0;

        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter element at position "+(i)+" : ");
            element = Integer.parseInt(br.readLine());
            oes.insert(element);
            System.out.println();
        }

        System.out.println();
        System.out.print("Array before sorting : ");
        oes.display();
        System.out.println();
        System.out.print("Array after sorting : ");
        //System.out.println();
        oes.oddEvenSort();
        oes.display();
        // System.out.println();
        // int m = median.medianOfArray();
        // System.out.println("Median = "+m);
    }
}