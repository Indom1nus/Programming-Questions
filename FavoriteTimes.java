import java.util.*;
public class FavoriteTimes
{
    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input");
        int x = scan.nextInt();
        int arr[] = {0,9,3,0};
        int count = 0;
        for(int i = 0; i<x;i++)
        {
            arr[3]++;
            if(arr[3] == 10)
            {
                arr[3] = 0;
                arr[2]++;
            }
            if(arr[2] == 6)
            {
                arr[2] = 0;
                arr[1]++;
            }
            if(arr[1] == 10)
            {
                arr[0] = 1;
                arr[1] = 0;
            }
            if(arr[1] == 3 && arr[0] == 1)
            {
                arr[0] = 0;
                arr[1] = 1;
            }
            if(mouse(arr) == true)
            {
                count++;
            }

            //System.out.println("" + arr[0] + arr[1] + ":" + arr[2] + arr[3]);
        }
        System.out.println(count);
    }

    public static boolean mouse(int[]arr)
    {
        if(arr[0] == 0)
        {
            int x = arr[2] - arr[1];
            if(arr[3] - arr[2] == x)
            {
                return true;
            }
        }
        if(arr[0] != 0)
        {
            int x = arr[1] - arr[0];
            if((arr[2] - arr[1] == x) && (arr[3] - arr[2] == x))
            {
                return true;
            }
        }
        return false;

    }
}
