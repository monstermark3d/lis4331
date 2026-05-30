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
        "Use following loop structures: for, enhanced for, while, do...while.\n\n" +
        "Note: Pretest loops: for, enhanced for, while. Posttest loop: do...while.\n" +
        "Integer.MIN_VALUE = " + Integer.MIN_VALUE + "\n" +
        "Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println();  //print blank line
    }

    public static int[] createArray()
    {
        Scanner sc = new Scanner(System.in);
        int arraySize = 0;  // initialize array size to zero
        
        System.out.print("Enter desired number of pseudorandom integers (min 1):");
        arraySize = sc.nextInt();

        int outputArray[] = new int[arraySize];
        return outputArray;
    }

    public static void generateRandomNumbers(int[] myArrayVals)
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