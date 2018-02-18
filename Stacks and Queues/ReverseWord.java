import java.util.*;
class ReverseWord
{
    private String input;
    private String output;

    public ReverseWord(String word)
    {
        input = word;
    }

    public String doReverse()
    {
        int maxSize = input.length();
        ReversalStack rs = new ReversalStack(maxSize);
        for(int i = 0; i < input.length(); i++)
        {
            if(!rs.isFull())
            {
                char c = input.charAt(i);
                rs.push(c);
            }
        }

        output = "";
        while(!rs.isEmpty())
        {
            char c = rs.pop();
            output += c;
        }

        return output;
    }
}