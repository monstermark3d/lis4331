//
import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Program converts inches to centimeters, meters, feet, yards, and miles.\n" +
        "***Notes***:\n" +
        "1) Use integer for inches (must validate integer input).\n" +
        "2) Use printf() function to print (format values per below output).\n" +
        "3) Create Java \"constants\" for the following values.\n" +
        "\tINCHES_TO_CENTIMETERS, \n\tINCHES_TO_METER, \n\tINCHES_TO_FOOT, \n\tINCHES_TO_YARD, \n\tFEET_TO_MILE\n");
    }

    public static void measurementConversion()
    {
        int inches=0;
        double centimeters=0.0;
        double meters=0.0;
        double feet=0.0;
        double yards=0.0;
        double miles=0.0;

        // constants
        final double INCHES_TO_CENTIMETERS = 2.54;
        final double INCHES_TO_METER = 0.0254;
        final double INCHES_TO_FOOT = 0.083333;
        final double INCHES_TO_YARD = 0.027778;
        final double INCHES_TO_MILE = 0.0000157828283;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number of inches: ");
        while(!sc.hasNextInt())
        {
            System.out.println("Not valid integer!\n");
            sc.next();
            System.out.print("Please enter number of inches: ");
        }
        inches = sc.nextInt();

        // Step #2 process data
        centimeters = inches * INCHES_TO_CENTIMETERS;
        meters = inches * INCHES_TO_METER;
        feet = inches * INCHES_TO_FOOT;
        yards = inches * INCHES_TO_YARD;
        miles = inches * INCHES_TO_MILE;

        // Step #3 ouput results
        System.out.printf("%,d inch(es) equals\n\n%,.6f centimeter(s)\n%,.6f meter(s)\n%,.6f feet\n%,.6f yard(s)\n%1.8f mile(s)\n", inches, centimeters, meters, feet, yards, miles);

        sc.close();
    }
}