import java.util.Scanner;

public class Methods
{

    static final Scanner sc = new Scanner(System.in);

    public static void getRequirements()
    {
        //display operational messages
        System.out.println("\nSphere Volume Program");
        System.out.println( "\nDeveloper: Mark Trombly");
        System.out.println( "Program calculates sphere volume in liquid U.S. gallons from user-entered diameter value in inches,\n" +
                            "and rounds to two decimal places.\n" +
                            "Must use Java's *built-in* PI and pow() capabilities.\n" +
                            "Program checks for nonpositive integers and non-numeric values.\n" +
                            "Program continues to prompt for user entry until no longer requested, prompt accepts upper or lower case letters.");

        System.out.println();  //print blank line
    }

    public static void getSphereVolume()
    {
        Scanner sc = new Scanner(System.in); //declare scanner obj for input
        int diameter = 0; //integer input
        double volume = 0.0; //calculated output
        double gallons = 0.0; 
        char choice = ' ';

        do
        {
            System.out.print("Please enter diameter in inches: ");
            while (!sc.hasNextInt())
            {
                System.out.println("Not valid integer!\n");
                sc.next();  // get the value to clear the input buffer
                System.out.print("Please try again. Enter diameter positive in inches: ");
            }

            diameter = sc.nextInt();

            while (diameter < 0)
            {

                System.out.println("Daimeter entered less than zero! ");
                System.out.println();
                System.out.print("Please try again. Enter diameter in positive inches: ");
                while (!sc.hasNextInt())
                {
                    //System.out.println();
                    System.out.println("Not a vaild positive integer:");
                    System.out.println();
                    sc.next();
                    System.out.print("Please try again. Enter diameter in positive inches: ");
                }
                
                //System.out.println();
                diameter = sc.nextInt();

            }

            System.out.println();  // blank line

            volume = ((4.0 / 3.0) * Math.PI * Math.pow(diameter / 2.0, 3));
            gallons = volume / 231; // cubic inches per gallon
            System.out.println("Sphere volume: " + String.format("%,.2f", gallons) + " liquid U.S. gallons");

            System.out.print("\nDo you want to claculate another sphere volume (y or n)? ");
            choice = sc.next().charAt(0);
            choice = Character.toLowerCase(choice);
        }
        while (choice == 'y');

        System.out.println("\nThank you for using our Sphere Volume Calculator!");
        sc.close();
    }
}