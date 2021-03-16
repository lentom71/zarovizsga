package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;

public class DigitsCounter
{
    int getCountOfDigits(String s)
    {
        if(s == null || s.isBlank())
        {
            return  0;
        }
        HashSet hs = new HashSet();
        for(Character c: s.toCharArray())
        {
            if (Character.isDigit(c))
            {
                hs.add(c);
            }
        }
        return  hs.size();
    }
}
