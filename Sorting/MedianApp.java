import java.io.*;
class MedianApp
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        Median median = new Median(size);

        System.out.println();
        int element = 0;

        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter element at position "+(i + 1)+" : ");
            element = Integer.parseInt(br.readLine());
            median.insert(element);
            System.out.println();
        }

        System.out.println();
        System.out.print("Array before sorting : ");
        median.display();
        System.out.println();
        System.out.print("Array after sorting : ");
        //System.out.println();
        median.insertionSort();
        median.display();
        System.out.println();
        int m = median.medianOfArray();
        System.out.println("Median = "+m);
    }
}