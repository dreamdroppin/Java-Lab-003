
import java.util.Scanner;
public class TimeConvert {

    public static void main(String args[]) {
        //Prompt the user for input
        Scanner in = new Scanner(System.in);
        System.out.println("The purpose of this is to organize your value of seconds");
        System.out.print("Here, enter the number of seconds: ");

        //Read and integer from the keyboard (total number of seconds)
        Scanner scanner;
        int numberSeconds = in.nextInt();
        in.close();

        //Calculate the results using the modulus operator

        //There are 3600 seconds in an hour, have the left over spill in minutes
        int hours = numberSeconds / 3600;
        //There are 60 in a minute, have the left over spill into seconds
        int minutes = (numberSeconds % 3600) / 60;

        int seconds = numberSeconds % 60;

        //Use printf to display the output in the format:
        //Float

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds%n", numberSeconds, hours, minutes, seconds);

    }
}
/*
Result needed:
Enter a total number of seconds: 5000
5000 seconds = 1 hours, 23 minutes, and 20 seconds
*/
