import java.io.*;
class BracketCheckerApp2
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter string : ");
        String expr = br.readLine();

        BracketChecker2 bc2 = new BracketChecker2(expr);

        if(bc2.checkBrackets())
        {
            System.out.println("Parsing successfull");
        }
        // else
        // {
        //     System.out.println("Error while parsing");
        // }
    }
}