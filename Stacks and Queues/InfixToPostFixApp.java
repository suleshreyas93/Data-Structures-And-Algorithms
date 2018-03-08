import java.io.*;
class InfixToPostFixApp
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter infix expression : ");
        String infix = br.readLine();

        InfixToPostfix intopost = new InfixToPostfix(infix);

        System.out.println("\nEquivalent Postfix expression = "+intopost.convertToPostFix());
    }
}