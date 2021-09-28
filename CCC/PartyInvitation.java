import java.util.*;

public class PartyInvitation
{
    public static void main(String...args)
    {
        System.out.println("Input:");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(); //the amount of friends
        int y = scan.nextInt(); // the amount of commands
        int numrounds[] = new int[y]; //the amount of rounds
        int friends[] = new int[x];
        for(int i = 0; i<numrounds.length;i++)
        {
            numrounds[i] = scan.nextInt();//the number of the rounds
        }

        for(int i = 0; i<x;i++)
        {
            friends[i] = i+1;
        }
        int k = 0;//this int will be used to see how many removals there are so that we can find a length of an array
        for(int i = 0;i<numrounds.length;i++)
        {
            for(int j = 0;j<friends.length;j++)
            {
                if(friends[j]!= 0)
                {
                    if(((k+1) % numrounds[i] == 0))
                    {
                        friends[j] = 0;
                    }
                    k++;
                }
            }
            k = 0;
        }

        for(int i = 0; i<friends.length;i++)
        {
            if(friends[i]!= 0)
            {
                System.out.println(friends[i]);
            }
        }
    }
}