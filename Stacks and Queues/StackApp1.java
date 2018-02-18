import java.util.*;
class StackApp1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();
        Stack1 stack = new Stack1(size);

        System.out.println();
        for(int i = 0; i < size; i++)
        {
            if(!stack.isFull())
            {
                stack.push(i);
                System.out.print(i+" pushed on to stack.");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Stack is : ");
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }

    }
}