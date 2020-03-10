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
            //exit the program if user doesnt enter an int
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
            //pass as many commands to the shell as stated above
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

    //regular constructor class
    public SHell(int size)
    {
        this.size = size;
        itteration = 0;
        cmdList = new String[size];
    }

    //empty constructor for testing
    public SHell()
    {
        itteration = 0;
    }

    //used in testing
    public void setSize(int size)
    {
        this.size = size;
        cmdList = new String[size];
    }

    //give a string to be processed
    public String passCmd(String cmd)
    {
        //used to iterate through the command
        int i = 0;
        //int to determine how far up to repeat a command
        int up = 0;
        //spot of the end of the last concatenation
        int lastCat = 0;
        //final string
        String str = "";
        //traverse the whole command
        while(i < cmd.length())
        {
            //if there's a Caret check for sequential ones
            if(cmd.charAt(i) == '^')
            {
                //if there's no command connected to the carret,
                // put the previous string into the output string
                if(i > 0)
                {
                    if (cmd.charAt(i - 1) == ' ') {
                        str = str + (cmd.substring(lastCat, i - 1) + " ");
                        lastCat = i;
                    }
                }
                //find all the Carrets and determine how many commands you need to go up
                int j = i;
                while(j < cmd.length() && cmd.charAt(j) == '^')
                {
                    j++;
                }
                up = j - i;
                i = j;
                //check if you went up too many places
                if((itteration - up) < 0)
                {
                    str = str + cmdList[0] + " ";
                    lastCat = i;
                }
                //add the command from the spot
                else
                {
                    str = str + cmdList[itteration - up] + " ";
                    lastCat = i;
                }
            }
            //if no Caret keep traversing
            else
            {
                i++;
            }
        }
        str += cmd.substring(lastCat, i);
        cmdList[itteration] = str;
        itteration++;
        System.out.println(str);
        return str;
    }

}

