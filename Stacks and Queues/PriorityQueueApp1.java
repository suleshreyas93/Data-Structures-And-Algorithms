import java.io.*;
class PriorityQueueApp1
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array : ");
        int maxSize = Integer.parseInt(br.readLine());

        PriorityQueue1 q1 = new PriorityQueue1(maxSize);
        q1.insert(3);
        q1.insert(5);
        q1.insert(2);
        q1.insert(1);

        System.out.print("\nQueue is : ");
        while(!q1.isEmpty())
        {
            System.out.print(q1.remove()+" ");
        }
    }
}