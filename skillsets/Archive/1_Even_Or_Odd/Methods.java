import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Program evaluates integers as even or odd.\n" +
        "Note: Program does *NOT* check for non-numeric characters.");

        System.out.println();  //print blank line
    }

    public static void evenOrOdd()
    {
        
        System.out.print("Enter integer: ");
        Scanner sc = new Scanner(System.in);
        int number = 0;
        number = sc.nextInt();
        
        if(number % 2 == 0) 
        {
            System.out.println(number + " is an even number.");
        }
        else
        {
            System.out.println(number + " is an odd number.");
        }

        sc.close();
    }
}