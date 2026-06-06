//
import javax.swing.JOptionPane;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        JOptionPane.showMessageDialog(null,
                            "Developer: Mark Trombly.\n" +
                            "Program uses Java GUI message and input dialogs.\n" +
                            "Program evaluates integers as even or odd.\n" +
                            "Note: Program *does* perform data validation,\n" +
                            "prompting user until correct data entered.");
    }

    public static int getNum()
    {
        //local variables used
        String numString = "";
        int num = 0;

        numString = JOptionPane.showInputDialog(null,
            "Enter integer:",
            "Number Test Dialog",
            JOptionPane.INFORMATION_MESSAGE);

        while (!isIntNumber(numString))
        {
            numString = JOptionPane.showInputDialog(null,
                                        "Invalid integer. Please enter integer:",
                                        "Number Test Dialog",
                                        JOptionPane.INFORMATION_MESSAGE);
        }

    num = Integer.parseInt(numString);
    return num;
    }

    private static boolean isIntNumber(String n)
    {
        try{
            Integer.parseInt(n);
            return true;
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
    }

    public static void printResults(int num)
    {
        if ( num % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, num + " is an even number.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, num + " is an odd number.");
        }
    }
}