import java.util.*;
public class ModernArt
{
    public static void main(String...args)
    {
         Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int numCommands = scan.nextInt();
        scan.nextLine();
        String commands[] = new String[numCommands];
        char positions[] = new char[numCommands];
        int nums[] = new int[numCommands]; //R 12
        for(int i = 0;i<commands.length;i++)
        {
            commands[i] = scan.nextLine();
            positions[i] = commands[i].charAt(0);
            String str = commands[i].substring(2);
            nums[i] = Integer.parseInt(str);
        }

        boolean[][] grid = new boolean[m][n];

        for(int i = 0;i<commands.length;i++)
        {
            if(positions[i] == 'R')
            {
                for(int j = 0;j<n;j++)
                {
                    int x = nums[i]-1;
                    //it is not just ij because we need to account for nums + 1
                    grid[x][j] = !grid[x][j];
                }
            }
            else
            {
                for(int j = 0;j<m;j++)
                {
                    int x = nums[i]-1;
                    grid[j][x] = !grid[j][x];
                }
            }
        }
        
        int count = 0;
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(grid[i][j])
                {
                    count++;
                }
            }
        }
        
        System.out.println(count);

    }
}