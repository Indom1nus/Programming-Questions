import java.util.*;
public class GlobalWarmingV2
{
    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Yee:");

        String x[] = new String[100];
        int limiter = 0;
        for(int i = 0;i<x.length;i++)
        {
            x[i] = scan.nextLine();
            if(x[i].charAt(0) == '0')
            {
                limiter = i;
                break;
            }
        }

        String cases[] = new String[limiter]; //all of the cases

        for(int i = 0;i<cases.length;i++)
        {
            int z = x[i].indexOf(" ");
            cases[i] = x[i].substring(z+1);
        }
        
        for(int i = 0;i<cases.length;i++) //going through each command
        {
            String[] v = cases[i].split(" ");
            int[] arjun = new int[v.length];
            int m[] = new int[arjun.length-1];
            //System.out.println(m.length);
            for(int j = 0;j<arjun.length;j++) //creation of the int array
            { 
                arjun[j] = Integer.parseInt(v[j]);
            }
            for(int k = 0;k<m.length;k++)
            {
                m[k] = arjun[k+1] - arjun[k]; //create the array of differences
                //System.out.print(m[k] + " ");
            }
            System.out.println(m[0]);
            int temp = 0;

            //find the first index ok, once you find that you start searching from the end to find the first instance of that first index and keep check
            boolean crazy = false;
            int highest = 0;
            int yabba = m[0];
            for(int ZZ = 1;ZZ< m.length;ZZ++)
            {
                int robert = m[temp];
                if(m[ZZ] == yabba)
                {
                    highest = ZZ;
                }
                if(m[ZZ] == robert)
                {
                    temp++;
                    //highestScore++;
                    crazy = true;
                }
                if(m[ZZ] != robert)
                {
                    temp = 0;
                    crazy = false;
                    highest = 0;
                }
            }
            if(crazy == false)
            {
                //System.out.println(m.length);
            }
            else
            {
                //System.out.println(highest);
            }

        }
    }
}