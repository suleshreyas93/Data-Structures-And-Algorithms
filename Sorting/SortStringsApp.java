import java.io.*;
class SortStringsApp
{
    public static void main(String[] args)throws IOException
    {
        int maxSize;
        String city_name;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the size of array : ");
        maxSize = Integer.parseInt(br.readLine());

        SortStrings sort = new SortStrings(maxSize);
        System.out.println();

        for(int i = 0; i < maxSize; i++)
        {
            System.out.print("Enter element at position "+(i + 1)+" : ");
            city_name = br.readLine();
            sort.insert(city_name);
            System.out.println();
        }

        System.out.println();
        System.out.print("Array Before Sorting : ");
        sort.display();

        System.out.println();
        System.out.println();

        System.out.print("Array after sorting : ");
        sort.quickSort();
        sort.display();

    }
}