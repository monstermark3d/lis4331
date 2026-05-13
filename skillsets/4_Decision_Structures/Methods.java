import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Program evaluates user-entered characters.\n" +
        "Use following characters: W or w, C or c, H or h, N or n.\n" +
        "Use following decision structures: if...else, and switch.\n\n");
    }

    public static void getUserPhoneType()
    {
        // variable declarations
        String userStr = "";
        char userChar = ' ';
        Scanner sc = new Scanner(System.in);

        System.out.println("Phone types: W or w (work), C or c (cell), H or h (home), N or n (none).");
        System.out.print("Enter phone type: ");
        userStr = sc.next().toLowerCase();
        userChar = userStr.charAt(0);

        System.out.println("\nif...else:");
        if (userChar == 'w')
            System.out.println("Phone type: work");
        else if (userChar == 'c')
            System.out.println("Phone type: cell");
        else if (userChar == 'h')
            System.out.println("Phone type: home");
        else if (userChar == 'n')
            System.out.println("Phone type: none");
        else
            System.out.println("Incorrect character entry.");
        
        System.out.println();   // blank line

        // switch statement
        System.out.println("Switch:");
        switch(userChar)
        {
            case 'w':
                System.out.println("Phone type: work");
                break;
            case 'c':
                System.out.println("Phone type: cell");
                break;
            case 'h':
                System.out.println("Phone type: home");
                break;
            case 'n':
                System.out.println("Phone type: none");
                break;
            default:
                System.out.println("Incorrect character entry.");
                break;
        }
    }
}