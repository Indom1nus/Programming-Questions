import java.util.*;
public class Sunflowers
{
    public static void main(String...args)
    {
        //System.out.println("yee");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.nextLine();
        String lines[] = new String[x];
        int grid[] [] = new int[x][x];
        String help [][] = new String[x][x];
        boolean full = false;
        boolean first = false;
        boolean tea = false;

        //input of grid
        for(int i = 0; i < lines.length;i++)
        {
            lines[i] = scan.nextLine();
        }

        //splits the grid up, seperates the spaces
        for(int i = 0; i< help.length;i++)
        {
            help[i] = lines[i].split(" ");
        }

        //converts it into ints
        for(int i = 0; i<grid.length;i++)
        {
            for(int j = 0;j<grid[i].length;j++)
            {
                grid[i][j] = Integer.parseInt(help[i][j]);
            }
        }

        while(first == false)//if it is not right the first time
        {
            //System.out.println("asda");
            for(int i = 0; i<grid.length;i++)
            {
                for(int j = 1;j<grid[i].length;j++)
                {
                    if(i!= grid.length-1)
                    {
                        if(grid[i][j]<grid[i][j-1] || grid[i+1][j]<grid[i][j])
                        {
                            swap(grid);
                            tea = true;
                            break;
                        }
                    }
                }
                if(tea == true)
                {
                    tea = false;
                    break;
                }
                if(i == grid.length-1) //if it goes through the array completley and it finds that everything is in order then we dont do the swapping stuff
                {
                    first = true;
                }
            }

        }

        for(int i = 0; i<grid.length;i++)
        {
            for(int j = 0; j<grid[i].length;j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] swap(int arr[][])
    {
        int temp1[][] = new int[arr.length][arr.length];
        int x = temp1.length-1;
        //creates an initial identical copy
        for(int i = 0; i< arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                temp1[i][j] = arr[i][j];
            }
        }

        int temp2[] = temp1[x];//want to get the last row
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                arr[j][i] = temp2[j];
            }
            if(x == 0)
            {
                break;
            }
            x--;
            temp2 = temp1[x];
            //System.out.println(temp2[0]);
        }

        return arr;
    }
}