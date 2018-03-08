class BracketChecker2
{
    private String inputString;
    private Stack2 stk;
    
    public BracketChecker2(String input)
    {
        inputString = input;
        stk = new Stack2(inputString.length());
        
    }

    public boolean checkBrackets()
    {
        for(int i = 0; i < inputString.length(); i++)
        {
            char currentChar = inputString.charAt(i);
            if(currentChar == '{' || currentChar == '[' || currentChar == '(')
            {
                stk.push(currentChar);
            }

            if(currentChar == '}' || currentChar == ']' || currentChar == ')')
            {
                if(!stk.isEmpty())
                {
                    char currentCharInStack = stk.pop();
                    if((currentChar == '}' && currentCharInStack != '{') || (currentChar == ']' && currentCharInStack != '[') || (currentChar == ')' && currentCharInStack != '('))
                    {
                        System.out.println("Error"+currentChar+" at "+i);
                        return false;

                    }
                }
                else
                {
                    System.out.println("Error"+currentChar+" at "+i);
                    return false;
                }
            }
            
        }

        if(!stk.isEmpty())
        {
            System.out.println("Right Delimiter Missing");
            return false;
        }
        return true;
        //System.out.println("Parsing successfull");
        
        
    }
}