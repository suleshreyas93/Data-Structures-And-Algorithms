import java.util.*;
class ReverseArray
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
        System.out.print("Array = ");
        for(String str : arr)
        {
            System.out.print(str+" ");
        }
        for(int i = 0; i < arr.length/2; i++)
        {
            String temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.print("Reversed Array = ");
        for(String str : arr)
        {
            System.out.print(str+" ");
        }
    }
}