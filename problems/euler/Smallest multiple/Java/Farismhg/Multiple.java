public class Multiple
{
    // Euclidian algorithm for finding greatest common divisor
    private static int GCD(int a, int b)
    {
        while(a != b)
        {
            if(a < b)
                b -= a;
            else
                a -= b;
        }

        return a;
    }

    public static void main(String[] args)
    {
        int max_num = 20,lcm = 1,gcd;

        for(int I = 2; I <= max_num; I++)
        {
            // determine what factor is not needed from I
            gcd = GCD(lcm,I);

            // and multiply lcm by the needed factor
            lcm *= I / gcd;
        }

        System.out.println(lcm);
    }
}
