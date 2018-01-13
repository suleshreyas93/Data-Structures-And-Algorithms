import java.io.*;
class ReverseNumber
{
    public static void main(String[] args)
    {
        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter the number : ");
            int number = Integer.parseInt(br.readLine());
            
            int reverse = 0;

            while(number > 0)
            {
                int temp = number % 10;
                reverse = (reverse * 10) + temp;
                number = number / 10;
            }

            System.out.print("\nReversed Number = "+reverse);
        }
        catch(Exception ex)
        {

        }
    }
}