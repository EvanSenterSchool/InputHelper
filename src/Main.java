import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Testing methods from InputHelper
        Scanner scan = new Scanner(System.in);

        //Testing getInt
        double x = InputHelper.getRangedDouble(scan, "please enter in an double value between 0.0-100.0", 0.0, 100.0);
        System.out.println("My number is " + x);

    }
        //Testing getString
}
