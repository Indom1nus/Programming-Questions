import java.util.*;
public class BoringBusiness
{
    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);
        boolean boolin = false;
        int grid[][] = new int[10][10];

        for(int i = 0;i<grid.length;i++)
        {
            grid[3][i] = 1;
        }

        String cmds[] = new String[3];
        int magnitude[] = new int[3];
        char dir[] = new char[3];
        int StartX = 5;
        int StartY = 5;
        grid[StartX][StartY] = 1;
        for(int i = 0;i<3;i++)
        {
            cmds[i] = scan.nextLine();
            dir[i] = cmds[i].charAt(0);
            magnitude[i] = Integer.parseInt(cmds[i].substring(2));
        }

        for(int i = 0;i<3;i++)
        {
            if(boolin == false) //if it hasnt crossed over
            {
                for(int j = 0;j<magnitude[i];j++)
                {
                    if(dir[i] == 'q')
                    {
                        break;
                    }
                    if(dir[i] == 'l')
                    {
                        StartY--;
                        grid[StartX][StartY]++;
                    }
                    if(dir[i] == 'r')
                    {
                        StartY++;
                        grid[StartX][StartY]++;
                    }
                    if(dir[i] == 'u')
                    {
                        StartX--;
                        grid[StartX][StartY]++;
                    }
                    if(dir[i] == 'd')
                    {
                        StartX++;
                        grid[StartX][StartY]++;
                    }
                    if(grid[StartX][StartY] > 1)
                    {
                        boolin = true;
                    }
                }
                if(boolin == true)
                {
                    System.out.println(StartY + " " + StartX + " DANGER");
                    break;
                }
                else
                {
                    System.out.println(StartY + " " + StartX + " safe");
                }
            }
        }

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                System.out.print(grid[i][j] + "\t");   
            } 
            System.out.println();
        }  

    }
}