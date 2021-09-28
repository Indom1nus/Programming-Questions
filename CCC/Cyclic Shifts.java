import java.util.*;
public class CyclicShifts
{
    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String r = scan.nextLine();
        String str3 [] = new String[r.length()];
        String str4 [] = new String[r.length()];
        int num2 = r.length();
        int total = 0;
        for(int kk = 0; kk < r.length(); kk++) 
        {
            str3[kk] = Character.toString(r.charAt(kk));
        }
       
        for(int t = 0; t<r.length(); t++)
        {
            if(t == 0)
            {
                str4[0] = r;
            }

            else if(t == 1)
            {
                str4[t] = r.substring(t,num2)+str3[t-1];
            }
            if(t>1)
            {
                str4[t] = str4[t-1].substring(1,num2) +str3[t-1];
            }

        }
        for(int i = 0; i<str4.length; i++)
        {
            if(s.indexOf(str4[i]) !=-1)
            {
                total++;
            }
        }
        if(total > 0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}