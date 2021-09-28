import java.util.*;
public class Flipper 
{
    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);
        String first =(" 1 ");
        String third =(" 3 ");
        String second = (" 2 ");
        String fourth = (" 4 ");
        String x = scan.nextLine();
        int y = x.length();
        int totalV = 0;
        int totalH = 0;
        for(int i = 0; i<x.length(); i++)
        {
            if(x.charAt(i)== 'V')
            {
                totalV++;
            }
            else if(x.charAt(i) == 'H')
            {
                totalH++;
            }
        }
        if(totalH % 2== 0 && totalV % 2 == 0)
        {
            System.out.println(first + second);
            System.out.println(third + fourth);
        }
        else if (totalH % 2 != 0 && totalV % 2 == 0)
        {
            System.out.println(third + fourth);
            System.out.println(first + second);
        }
        else if(totalV % 2 != 0 && totalH %2 == 0)
        {
            System.out.println( second + first);
            System.out.println( fourth + third);
        }
        else
        {
            System.out.println(fourth + third);
            System.out.println(second + first);
        }

        
    }
}

