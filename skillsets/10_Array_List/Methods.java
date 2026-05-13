import java.util.Scanner;
import java.util.ArrayList;

public class Methods
{

    static final Scanner sc = new Scanner(System.in);

    public static void getRequirements()
    {
        //display operational messages
        System.out.println( "Developer: Mark Trombly");
        System.out.println( "Program populates ArrayList of strings with user-entered animal type values.\n" +
                            "Examples: Polar bear, Guinea pig, dog, cat, bird.\n" +
                            "Program continues to collect user-entered values until user types \"n\".\n" +
                            "Program displays ArrayList values after each iteration, as well as size.");

        System.out.println();  //print blank line
    }

    public static void createArrayList()
    {
        // program variables/object creation/instantation
        // scanner obj
        Scanner sc = new Scanner(System.in);
        ArrayList<String> obj = new ArrayList<String>();
        String myStr = "";
        String choice = "y";
        int num = 0;

        while (choice.equals("y"))
        {
            System.out.print("Enter animal type: ");
            myStr = sc.nextLine();
            obj.add(myStr); // add string entered by user into arrayList
            num = obj.size();   // set num equal to size of arrayList
            System.out.println("ArrayList elements:" + obj+ "\nArrayList Size = " + num);
            System.out.print("\nContinue? Enter y or n: ");
            choice = sc.next().toLowerCase();
            sc.nextLine();
        }
      
    }

    
}