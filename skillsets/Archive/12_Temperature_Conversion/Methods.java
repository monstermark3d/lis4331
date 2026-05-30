import java.util.Scanner;

public class Methods
{

    static final Scanner sc = new Scanner(System.in);

    public static void getRequirements()
    {
        //display operational messages
        System.out.println( "Developer: Mark Trombly");
        System.out.println( "Temperature Conversion Program\n" +
                            "Program convers user-entered temperatures into Fahrenheit or Celsius scales.\n" +
                            "Program continues to prompt user entry until no longer requested.\n" +
                            "Note: upper or lower case letters permitted. Though, incorrect entries are not permitted.\n" +
                            "Note: Program does not validate numeric data (optional requirement).");

        System.out.println();  //print blank line
    }

    public static void convertTemp()
    {
        Scanner sc = new Scanner(System.in);
        double temperature = 0.0;
        char choice = ' ';
        char type = ' ';

        do
        {
            System.out.print("Fahrenheit to Celsius? Type\"f\", or Celsius to Fahrenheit? Type \"c\": ");
            type = sc.next().charAt(0);
            type = Character.toLowerCase(type);
            if(type == 'f')
                {
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temperature = sc.nextDouble();
                    temperature = ((temperature - 32)*5)/9;
                    System.out.println("Temperature in Celsius = " + temperature);
                }
            else if(type == 'c')
                {
                    System.out.print("Enter temperature in Celsius: ");
                    temperature = sc.nextDouble();
                    temperature = (temperature * 9/5) + 32;
                    System.out.println("Temperature in Fahrenheit = " + temperature);
                }
            else
                {
                    System.out.println("Incorrect entry. Please try again.");
                }
            System.out.print("\nDo you want to convert a temperature (y or n)? ");
            choice = sc.next().charAt(0);
            choice = Character.toLowerCase(choice);
        }
        while (choice == 'y');

        System.out.println("\nThank you for using our Tempreature Conversion Program!");
    }
}