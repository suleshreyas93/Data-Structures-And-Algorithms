class BracketChecker
{
    private String inputString;

    public BracketChecker(String input)
    {
        inputString = input;
    }

    public void check()
    {
        int length = inputString.length();
        DelimiterStack ds = new DelimiterStack(length);

        for(int i = 0; i < inputString.length(); i++)
        {
            char ch = inputString.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(')
            {
                ds.push(ch);
            }

            if(ch == '}' || ch == ']' || ch == ')')
            {
                if(!ds.isEmpty())
                {
                    char myChar = ds.pop();
                    if((myChar == '}' && ch != '{') || (myChar == ']' && ch != '[') || (myChar == ')' && ch != '('))
                    {
                        System.out.println("Erro "+ch+" at "+i);
                    }

                }
                else
                {
                    System.out.println("Error "+ch+" at "+i);
                }
            }

            if(!ds.isEmpty())
            {
                System.out.println("Missing right delimiter");
            }
            System.out.println("Parsing Successfull.");
        }
    }
}