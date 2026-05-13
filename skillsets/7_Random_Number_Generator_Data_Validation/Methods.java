import java.util.Random;
import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Print minimum and maximum integer values.\n" +
        "Program prompts user to enter desired number of pseudorandom-generated integers (min 1).\n" +
        "Program validates user input for integers greater than 0.\n" +
        "Use following loop structures: for, enhanced for, while, do...while.\n\n" +
        
        "Integer.MIN_VALUE = " + Integer.MIN_VALUE + "\n" +
        "Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println();  //print blank line
    }

    public static int[] createArray()
    {
        Scanner sc = new Scanner(System.in);
        int arraySize = 0;  // initialize array size to zero
        
        System.out.print("Enter desired number of pseudo-random integers (min 1):");
        while (!sc.hasNextInt())
            {
                System.out.println("Not valid integer!\n");
                sc.next();  //Important! Consume invalid token to prevent infinite loop!
                System.out.print("Please try again. Enter valid integer (min 1): ");
            }
        arraySize = sc.nextInt(); //valid int

        while(arraySize < 1)
            {
                System.out.print("\nNumber must be greather than 0. Please enter integer greater than 0: ");
                while (!sc.hasNextInt())
                    {
                        System.out.print("\nNumber must be integer: ");
                        sc.next();
                        System.out.print("Please try again. Enter integer value greater than 0: ");
                    }
                arraySize = sc.nextInt(); //valid int greater than 0
            }
            

        int outputArray[] = new int[arraySize];
        sc.close();
        return outputArray;
    }

    public static void generatePseudoRandomNumbers(int[] myArrayVals)
    {
        Random r = new Random();    // create random object

        int i = 0;  // initialize variables

        System.out.println("for loop:");
        for (i=0; i < myArrayVals.length; i++)
        {
            System.out.println(r.nextInt());

        }

        System.out.println("\nEnhanced for loop:");
        for(int n: myArrayVals)
        {
            System.out.println(r.nextInt());
        }

        System.out.println("\nwhile loop:");
        i = 0; 
        while (i < myArrayVals.length)
        {
            System.out.println(r.nextInt());
            i++;
        }

        System.out.println("\ndo...while loop:");
        i = 0;
        do
        {
            System.out.println(r.nextInt());
            i++;
        }
        while (i < myArrayVals.length);
    }
}