import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Program evaluates largest of three integers.\n" +
        "Note: Program checks for integers and non-numeric values.");

        System.out.println();  //print blank line
    }

    public static void validateUserInput()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;

        //prompt user for three integers
        System.out.print("Please enter first number: ");

        while (!sc.hasNextInt())
            {
                System.out.println("Not valid integer!\n");
                sc.next();  //must consume invalid token to prevent infinte loop!
                System.out.print("Please try again. Enter first number: ");
            }
        num1 = sc.nextInt();
        System.out.println();

        System.out.print("Please enter second number: ");

        while (!sc.hasNextInt())
            {
                System.out.println("Not valid integer!\n");
                sc.next();  //must consume invalid token to prevent infinte loop!
                System.out.print("Please try again. Enter second number: ");
            }
        num2 = sc.nextInt();
        System.out.println();

        System.out.print("Please enter third number: ");

        while (!sc.hasNextInt())
            {
                System.out.println("Not valid integer!\n");
                sc.next();  //must consume invalid token to prevent infinte loop!
                System.out.print("Please try again. Enter third number: ");
            }
        num3 = sc.nextInt();

        System.out.println(); // blank line
        getLargestNumber(num1, num2, num3);
    }

    public static void getLargestNumber(int num1, int num2, int num3)
    {
        System.out.println("Numbers entered: " + num1 + ", " + num2 + ", " + num3);

        if ( num1 > num2 && num1 > num3 )
            System.out.println("First number is largest.");
        else if ( num2 > num1 && num2 > num3)
            System.out.println("Second number is largest.");
        else if ( num3 > num1 && num3 > num2 )
            System.out.println("Third number is largest.");
        else
            System.out.println("Integers are equal.");
    }
}