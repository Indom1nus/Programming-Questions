import java.util.*;
public class TimeOnTask
{
    public static void main(String...args)
    {
        System.out.println("Input:");

        Scanner scan =  new Scanner(System.in);

        int totaltime = scan.nextInt();
        int x = scan.nextInt();
        int numchores[] = new int[x];

        for(int i = 0; i<numchores.length;i++)
        {
            numchores[i] = scan.nextInt();
        }

        Arrays.sort(numchores);

        
        int num = 0;
        for(int i = 0;i<numchores.length;i++)
        {
            if(numchores[i] <= totaltime)
            {
                num++;
                totaltime-=numchores[i];
            }
        }
        
        System.out.println(num);
    }
}