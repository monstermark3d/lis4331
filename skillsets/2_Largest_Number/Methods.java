import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Program evaluates largest of two integers.\n" +
        "Note: Program does *NOT* check for non-numeric characters or non-integer values.");

        System.out.println();  //print blank line
    }

    public static void largestNumber()
    {
        
        Scanner sc = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;

        System.out.print("Enter first integer: "); 
        firstNumber = sc.nextInt();

        System.out.print("Enter second integer: "); 
        secondNumber = sc.nextInt();
        
        if(firstNumber > secondNumber) 
        {
            System.out.println(firstNumber + " is larger than " + secondNumber);
        }
        else if(secondNumber > firstNumber)
        {
            System.out.println(secondNumber + " is larger than " + firstNumber);
        }
        else 
        {
            System.out.println("Integers are equal.");
        }

        sc.close();
    }
}