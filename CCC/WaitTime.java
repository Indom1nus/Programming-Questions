import java.util.*;
public class WaitTime
{
    public static void main(String...args)
    {
        System.out.println("Yee");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.nextLine();
        String str[] = new String[x];
        int friendsraw[]= new int[100];
        int z = 0;

        for(int i = 0;i<x;i++)
        {
            str[i] = scan.nextLine();
        }

        //collects all the friends
        for(int i = 0; i<x;i++)
        {
            if(str[i].charAt(0) == 'R')
            {
                friendsraw[z] = Integer.parseInt(str[i].substring(2));
                z++;
            }
        }

        for(int i = 0;i<friendsraw.length;i++)
        {
            if(friendsraw[i] == 0)
            {
                z = i;
                break;
            }
        }

        int friends[] = new int[z];
        int friendsTime[] = new int[z];
        for(int i = 0; i<friends.length;i++)
        {
            friends[i] = friendsraw[i];
            System.out.println(friends[i]);
        }
        int k = 0;
        for(int i = 0; i<x;i++)
        {
            if(str[i].substring(2).equals(String.valueOf(friends[k])) && str[i].charAt(0) == 'R')//if we find an R with the first friend of the friend array
            {
                for(int j = i; j<x;j++)
                {
                    if(str[i].substring(2).equals(String.valueOf(friends[k])) && str[i].charAt(0) == 'S')
                    {
                        friendsTime[k] = j;
                    }
                }
            }
        }

    }
}