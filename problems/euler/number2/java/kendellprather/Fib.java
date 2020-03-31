//By Kendell Prather

public class Fib {

    public static void main(String[] args) {

        run();

    }

    public static void run() {
        int sum = 0;
        int f[] = new int[100]; //array could be smaller, was just my first guess

        //0th and 1st number of the series are 0 and 1
        f[0] = 0;
        f[1] = 1;

        //algorithm for sum of fib sequence up to 4 mil
        for (int i = 2; i <= f.length - 1; i++) {
            f[i] = f[i - 1] + f[i - 2];
            if (f[i] >= 4000000) {
                break;
            }
        }
        for (int j = 0; j < f.length; j++) {
            if (f[j] % 2 == 0) {
                sum = sum + f[j];
            }
        }
        System.out.println("Answer = " + sum);
    }

}
