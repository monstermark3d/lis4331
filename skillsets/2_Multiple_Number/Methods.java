import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Program determines if first number is multiple of second, prints result.\n" +
        "Example: 2, 4, 6, 8 are multiples of 2.\n" +
        "1) Use integers. 2) Use printf() function to print.\n" +
        "Must *only* permit integer entry.\n");

        System.out.println();  //print blank line
    }

    public static void findMultiple()
    {
        Scanner sc = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;
        int numProduct = 0;

        System.out.print("Enter Num1: ");
       
        while (!sc.hasNextInt()) {
            System.out.println("Not valid integer!\n");
            System.out.print("Please try again. Enter Num1: ");
            sc.next(); 
        }

        numOne = sc.nextInt();

        System.out.print("Enter Num2: ");
       
        while (!sc.hasNextInt()) {
            System.out.println("Not valid integer!\n");
            System.out.print("Please try again. Enter Num2: ");
            sc.next(); 
        }

        numTwo = sc.nextInt();

        System.out.println();  //print blank line

        if (numOne % numTwo == 0){
            numProduct = numOne / numTwo;
            System.out.printf(numOne + " is a multiple of " + numTwo);
            System.out.println();  //print blank line
            System.out.printf("The product of " + numProduct + " and " + numTwo + " is " + numOne);
        } else 
            System.out.println(numOne + " is *not* a multiple of " + numTwo);        

        sc.close();
    }
}