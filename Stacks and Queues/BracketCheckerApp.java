import java.io.*;

class BracketCheckerApp
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter String : ");
        String str = br.readLine();

        BracketChecker bc = new BracketChecker(str);
        bc.check();
    }
}