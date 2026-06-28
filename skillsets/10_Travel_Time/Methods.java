//
// Written by: Mark Trombly
//
import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Program calculates approximate travel time.\n" +
        "Prompt user to enter miles and miles per hour (accepts double values).\n" +    
        "*Must* perform data validation: \n" +
        "\ta. only numbers,\n" +
        "\tb. miles range (>0 and no more than 3000), \n" +
        "\tc. MPH range (>0 and no more than 100).\n\n" +
        "Display approximate travel time in hours and minutes.\n" +
        "Hint: Use integer arithmetic, and division and modulus operators to calculate hours and minutes.\n\n" +
        "Prompt user to continue (only if user enters \"y\" or \"Y\").\n" +
        "Note: Can create either GUI or command-line program--your option.\n");
    }

    public static double validateRange()
    {
        //initialize variables
       Scanner sc = new Scanner(System.in);
       double miles = 0.0;
       boolean valid = false;

       while (!valid){
            System.out.print("\nEnter miles: ");

            if (sc.hasNextDouble())
            {
                miles = sc.nextDouble();

                if (miles >= 1 && miles <= 3000)
                {
                    valid = true;
                } else {
                    System.out.println("Miles must be between 1 and 3000, inclusive. Please try again.");
                }
            } else {
                System.out.println("Please enter valid number.");
                sc.next();
            }
        }
      return miles;
    }

    public static double validateSpeed()
    {
        //initialize variables
        Scanner sc = new Scanner(System.in);
        double mph = 0;
        boolean valid = false;

        while (!valid)
        {
            System.out.print("\nEnter MPH: ");

            if (sc.hasNextDouble()) 
            {
                mph = sc.nextDouble();

                if (mph >= 1 && mph <= 100)
                {
                    valid = true;
                } else {
                    System.out.println("MPH must be between 1 and 100, inclusive. Please try again.");
                }
            } else {
                System.out.println("Please enter valid number.");
                sc.next();
            }
        }
    return mph;
    }

    public static void calculateTravelTime(double miles, double mph)
    {
        //initialize variables
        double hours = 0.0;
        int minutes = 0;
        int hoursInt = 0;
        int minutesRemainder = 0;

        hours = miles / mph;

        minutes = (int) (hours * 60);

        hoursInt = minutes / 60;
        minutesRemainder = minutes % 60;

        //results
        System.out.println("Estimated travel time: " + hoursInt + "hr(s) " + minutesRemainder + " Minutes");
        
        System.out.println("Thank you for using the program!");
    }

}