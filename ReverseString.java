import java.io.*;
class ReverseString
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter String : ");
        String str = br.readLine();

        System.out.println();
        char[] strArray = str.toCharArray();
        for(int i = 0; i < strArray.length/2; i++)
        {
            char temp = strArray[strArray.length - 1 - i];
            strArray[strArray.length - 1 - i] = strArray[i];
            strArray[i] = temp;
        }
        System.out.print("Reversed String : ");
        for(int i = 0; i < strArray.length; i++)
        {
            System.out.print(strArray[i]);
        }
    }
}