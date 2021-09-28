import java.util.*;
public class ArrivalTime
{
    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);

        String x = scan.nextLine();
        boolean c = false;
        String temp[] = x.split(":");
        int time[] = new int[temp.length];
        boolean cases = false;

        for(int i = 0; i<temp.length;i++)
        {
            time[i] = Integer.parseInt(temp[i]);
        }

        int rush = time[0];
        int rush2 = time[1];

        int timez = (time[0]*100 + time[1]);
        int count = 0;

        double mins = 0.0;
        while(rushing(rush) == false)
        {
            if(mins == 119)
            {
                c = true;
                break;
            }
            mins+=1;
            rush2++;
            if(rush2 == 60)
            {
                rush2 = 0;
                rush++;
            }
        }
        
        if(c == false)
        {
            while(rushing(rush) == true)
            {
                if(mins == 120)
                {
                    break;
                }
                mins+=.5;
                rush2++;
                if(rush2 == 60)
                {
                    rush2 = 0;
                    rush++;
                }
            }
        }

        double z = 120 - mins;


        rush2+= z;
        int tempz = rush2;

        while(tempz >= 60)
        {
            rush++;
            rush2= 0;
            tempz-=60;
            cases = true;
        }

        if(cases == true)
        {
            rush2+=tempz;
        }

        if(rush >= 24)
        {
            rush-=24;
        }
        String str = String.valueOf(rush);
        String str2 = String.valueOf(rush2);
        if(rush < 10)
        {
            str = "0" + rush;
        }
        if(rush2 < 10)
        {
            str2 = "0" + rush2;
        }

        System.out.println(str + ":" + str2);

    }

    public static boolean rushing(int x)
    {
        if((x >= 7 && x < 10) || (x >= 15 && x < 19))
        {
            return true;
        }
        return false;
    }
}