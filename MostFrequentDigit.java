import java.util.HashMap;
import java.util.Map;

class MostFrequentDigit
{
    public static void main(String[] args)
    {
        String num = "675356291270936062618792023759228973612931947845036106320615547656937452547443078688431492068926649504871727226106159490917711597767365639481293908850963856115984810304444763175962178574185975388318964333860488897764303092540594692247754812893680210511085064625862847240629908131103403919693380566400462675698728299602761321599149107587048042961042220552902838040919625449936050294351";
        HashMap<Character,Integer> freqDigit = new HashMap<Character,Integer>();

        for(int i = 0; i < num.length(); i++)
        {
            
            if(freqDigit.containsKey(num.charAt(i)))
            {
                int currentCount = freqDigit.get(num.charAt(i));
                currentCount++;
                freqDigit.put(num.charAt(i), currentCount);
            }
            else
            {
                int count = 1;
                freqDigit.put(num.charAt(i), count);
            }
        }

        for(Map.Entry<Character,Integer> entry : freqDigit.entrySet())
        {
            System.out.println("Digit = "+entry.getKey()+" Count = "+entry.getValue());
        }

        int max = 0;
        char digit = '\0';
        for(Map.Entry<Character,Integer> entry : freqDigit.entrySet())
        {
            if(entry.getValue() > max)
            {
                max = entry.getValue();
                
                digit = entry.getKey();
                
            }
        }

        for(Map.Entry<Character,Integer> entry : freqDigit.entrySet())
        {
            if(entry.getValue() == max)
            {
                if(entry.getKey() > digit)
                {
                    digit = entry.getKey();
                }
            }
        }
        System.out.println("Most Frequent Digit = "+digit);
    }
}