import java.util.Scanner;

public class Methods
{

    static final Scanner sc = new Scanner(System.in);

    public static void getRequirements()
    {
        //display operational messages
        System.out.println( "Developer: Mark Trombly");
        System.out.println( "1) Program creates array size at run-time.\n" +
                            "2) Program displays array size.\n" +
                            "3) Program rounds sum and average of numbers to two decimal places.\n" +
                            "4) Numbers *must* be float data type, not double.");

        System.out.println();  //print blank line
    }

    public static int validateArraySize()
    {
       int arraySize = 0;

       //prompt user for array size
       System.out.print("Please enter array size: ");
       //Does not consume input token-only determines its type!
       while (!sc.hasNextInt())
            {
                System.out.println("Not valid integer!\n");
                sc.next();
                System.out.print("Please try again. Enter array size: ");
            }
        arraySize=sc.nextInt();
        System.out.println();   //blank line

        return arraySize;
    }

    public static void calculateNumbers(int arraySize)
    {
        float sum = 0.0f;
        float averge = 0.0f;

        System.out.print("Please enter " + arraySize + " numbers.\n");

        float numsArray[] = new float[arraySize];

        for(int i = 0; i < arraySize ; i++)
            {
                System.out.print("Enter num " + (i + 1) + ": ");

                while (!sc.hasNextFloat())
                    {
                        System.out.println("Not valid number!\n");
                        sc.next();
                        System.out.print("Please try again. Enter num " + (i + 1) + ": ");
                    }
                numsArray[i] = sc.nextFloat();
                sum = sum + numsArray[i];
            }
        averge = sum / arraySize;

        System.out.print("\nNumbers entered: ");
        for (int i = 0; i < numsArray.length; i++)
            {
                System.out.print(numsArray[i] + " ");
            }
        
        printNumbers(sum, averge);
    }

    public static void printNumbers(float sum, float average)
    {
        System.out.println("\nSum: " + String.format("%.2f", sum));
        System.out.println("Average: " + String.format("%.2f", average));
    }
}