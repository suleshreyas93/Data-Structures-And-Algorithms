import java.util.*;
class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();
        String[] arr = new String[size];

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter string at position "+(i + 1)+" : ");
            arr[i] = scan.next();
            System.out.println();
        }
        System.out.println();
        System.out.print("Array before sorting : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Array after sorting : ");
        for(int outer = arr.length - 1; outer > 0; outer --)
        {
            for(int inner = 0; inner < outer; inner++)
            {
                if(arr[inner].compareToIgnoreCase(arr[inner + 1]) > 0)
                {
                    String temp = arr[inner];
                    arr[inner] = arr[inner + 1];
                    arr[inner + 1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}