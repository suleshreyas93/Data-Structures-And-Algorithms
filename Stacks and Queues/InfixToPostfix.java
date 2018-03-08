class InfixToPostfix
{
    private String inpuString;
    private String output = "";
    private InToPostStack itps;

    public InfixToPostfix(String input)
    {
        inpuString = input;
        itps = new InToPostStack(inpuString.length());
    }

    public String convertToPostFix()
    {
        for(int j = 0; j < inpuString.length(); j++)
        {
            char currentChar = inpuString.charAt(j);
            switch(currentChar)
            {
                case '(':
                    itps.push(currentChar);
                    break;

                case '+':
                case '-':
                    doOperators(currentChar,1);
                    break;

                case '*':
                case '/':
                    doOperators(currentChar,2);
                    break;

                case ')':
                    doParenthensis(currentChar);
                    break;

                default:
                    output = output + currentChar;
                    break;
            }
        }

        while(!itps.isEmpty())
        {
            output = output + itps.pop();
        }

        return output;
    }

    public void doOperators(char currentOperator, int precedence1)
    {
        
        while(!itps.isEmpty())
        {
            char currentOperatorInStack = itps.pop();
            
            if(currentOperatorInStack == '(')
            {
                itps.push(currentOperatorInStack);
                break;
            }
            else
            {
                int precedence2;
                if(currentOperatorInStack == '+' || currentOperatorInStack == '-')
                {
                    precedence2 = 1;
                }
                else
                {
                    precedence2 = 2;
                }

                if(precedence2 < precedence1)
                {
                    itps.push(currentOperatorInStack);
                    break;
                }
                else
                {
                    output = output + currentOperatorInStack;
                    
                }
            }

        }
        itps.push(currentOperator);
    }

    public void doParenthensis(char paren)
    {
        while(!itps.isEmpty())
        {
            char temp = itps.pop();
            if(temp == '(')
            {
                break;
            }
            else
            {
                output = output + temp;
            }
        }
    }
}