import java.util.*;
class UniqueString
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String string = scan.nextLine();
        System.out.println(string+" is unique : "+unique(string));
    }

    public static boolean unique(String str)
    {
        boolean[] char_set = new boolean[256];//assuming the basic ASCII character set
        for(int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i);
            if(char_set[val])
            {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}