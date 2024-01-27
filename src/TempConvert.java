import java.util.Scanner;
public class TempConvert {

    public static void main(String args[]) {
        //Prompt the user for input
        Scanner in = new Scanner(System.in);
        System.out.print("In Celsius, enter the temperature: ");
        String x = in.nextLine();

        // Read a double value from the keyboard
        double cel = Double.parseDouble(x);

        //Result using the formula: F = C × 9/5 + 32
        double faher = cel * 9 / 5 + 32;

        //Format the output to one decimal place
        System.out.printf("%.1f C = %.1f F%n", cel, faher);
        //double faher = cel * 9 / 5 + 32;

        //Tests the program by entering a temperature in Celsius
    }
}
/*
Result needed:
 Enter a temperature in Celsius: 24
 24.0 C = 75.2 F
*/



