import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner scn = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int size = 0;
        String nxt;
        while(i == 0)
        {
            j = 0;
            System.out.println("Enter number of commands that will be entered, then enter the commands");
            System.out.println("-------------------------enter exit to quit-----------------------");
            if(scn.hasNextInt())
            {
                size = scn.nextInt();
                System.out.println(size);
            }
            else
            {
                i = 1;
                break;
            }
            SHell shelly = new SHell(size);
            nxt = scn.nextLine();
            while(j < size)
            {
                nxt = scn.nextLine();
               shelly.passCmd(nxt);
                j++;
            }
        }
    }
}
class SHell
{
    String[] cmdList;
    int size;
    int itteration;

    public SHell(int size)
    {
        this.size = size;
        itteration = 0;
        cmdList = new String[size];
    }

    public void passCmd(String cmd)
    {
        int i = 0;
        //int to determine how far up to repeat a command
        int up = 0;
        //spot of the end of the last concatenatation
        int lastCat = 0;
        //final string
        String str = "";
        while(i < cmd.length())
        {
            if(cmd.charAt(i) == '^')
            {
                if(i > 0)
                {
                    if (cmd.charAt(i - 1) == ' ') {
                        str = str + cmd.substring(lastCat, i - 1);
                        lastCat = i;
                    }
                }
                int j = i;
                while(j < cmd.length() && cmd.charAt(j) == '^')
                {
                    j++;
                }
                up = j - i;
                i = j;
                if((itteration - up) < 0)
                {
                    str = str + cmdList[0] + " ";
                    lastCat = i;
                }
                else
                {
                    str = str + cmdList[itteration - up] + " ";
                    lastCat = i;
                }
            }
            else
                {
                i++;
            }
        }
        str += cmd.substring(lastCat, i);
        cmdList[itteration] = str;
        System.out.println(str);
        itteration++;
    }

}

