import java.util.*;
public class BigBangSecrets
{
    public static void main(String...args)
    {
        System.out.println("Yee:");

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();

        char[] letters = new char[str.length()];

        for(int i = 0; i<letters.length;i++)
        {
            letters[i] = str.charAt(i);
        }
        int z = 0;
        int ascii = 0;
        int y = 0;
        for(int i = 0;i<letters.length;i++)
        {
            z = 3*(i+1) + x; 
            ascii = (int) letters[i];
            ascii-=z;
            if(ascii < 65)
            {
                y = 65-ascii;
                letters[i] = (char)(90 - (y-1));
            }
            else
            {
                letters[i] = (char)ascii;
            }
        }

        for(int i = 0;i<letters.length;i++)
        {
            System.out.print(letters[i]);
        }
    }
}