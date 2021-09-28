import java.util.*;
public class GlobalWarmingV1
{
    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input:");

        String x = scan.nextLine();
        int z = x.indexOf(" ");
        String asd = x.substring(z+1);

        String str2[] = asd.split(" ");

        int[] az = new int[str2.length];
        int m[] = new int[az.length-1];
        for(int j = 0;j<az.length;j++) //creation of the int array
        {
            az[j] = Integer.parseInt(str2[j]);
        }
        for(int k = 0;k<m.length;k++)
        {
            m[k] = az[k+1] - az[k];
            //System.out.print(m[k] + " ");
        }

        //System.out.println(m.length);

        int temp = 0;

        //find the first index ok, once you find that you start searching from the end to find the first instance of that first index and keep check
        boolean crazy = false;
        int highest = 0;
        int yabba = m[0];
        for(int ZZ = 1;ZZ< m.length;ZZ++)
        {
            int xz = m[temp];
            if((m[ZZ] == yabba && crazy == false) || (m[ZZ] == yabba && ZZ==1)) //must be first occurence of pattern
            {
                highest = ZZ;
            }
            if(m[ZZ] == xz)
            {
                temp++;
                crazy = true;
            }
            if(m[ZZ] != xz)
            {
                temp = 0;
                crazy = false;
                highest = 0;
            }
        }
        if(crazy == false)
        {
            System.out.println(m.length);
        }
        else
        {
            System.out.println(highest);
        }
    }
}