import java.io.*;
class LinearSearch
{
    public static void main(String[] args)throws IOException
    {   
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter element at position "+(i+1)+" : ");
            arr[i] = Integer.parseInt(br.readLine());
            System.out.println();
        }

        System.out.print("Array = ");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.print("Enter element to search : ");
        int search = Integer.parseInt(br.readLine());
        boolean flag = false;
        int i;
        for(i = 0; i < arr.length; i++)
        {
            if(search == arr[i])
            {
                flag = true;
                break;
            }
        }

        if(flag == true)
        {
            System.out.println(search+" found at position "+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}