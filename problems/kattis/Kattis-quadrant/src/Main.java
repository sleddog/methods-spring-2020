import java.io.*;
import java.util.*;

public class Main {


    static int Quad(double x, double y) {

        if (x > 0 && y > 0) {
            System.out.println("1");
            return 1;
        } else if (x < 0 && y > 0) {
            System.out.println("2");
            return 2;
        } else if (x < 0 && y < 0) {
            System.out.println("3");
            return 3;
        }
        else if(x > 0 && y < 0) {
            System.out.println("4");
            return 4;
        }
        else {
            System.out.println("Incorrect input");
            return 5;
        }
    }

    public static void main(String[] args) {
        double x,y;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your x value: ");
        x = s.nextDouble();
        System.out.println("Enter your y value: ");
        y = s.nextDouble();
        System.out.println("You entered x = " + x + " and y = " + y);

        Quad(x, y);

    }
}
