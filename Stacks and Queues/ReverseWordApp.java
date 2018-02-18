import java.io.*;
class ReverseWordApp
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter word : ");
        String word = br.readLine();
        ReverseWord rw = new ReverseWord(word);

        System.out.println();
        System.out.println("Word is : "+word);
        System.out.println("Reversed word is : "+rw.doReverse());
    }
}