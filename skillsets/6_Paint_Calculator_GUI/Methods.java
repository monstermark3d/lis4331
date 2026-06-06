//
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        JOptionPane.showMessageDialog(null,
                            "Developer: Mark Trombly.\n" +
                            "Program uses Java GUI message and input dialogs.\n" +
                            "Program determines paint cost per room (i.e., \"area\").\n" +
                            "For paint \"area\" simplicity: use length X height X 2 + width X height X 2.\n" +
                            "Format numbers as per below: thousand separator, decimal point and $ sign for currency.\n" +
                            "Research how many square feet a gallon of paint covers.\n" +
                            "Note: Program performs data validation.");
    }

    public static double getPaintCost()
    {
        //local variables used
        String paintCostString = "";
        double paintCost = 0.0;

        paintCostString = JOptionPane.showInputDialog(null,
                                        "Paint price per gallon:",
                                        "Paint Cost Calculator",
                                        JOptionPane.INFORMATION_MESSAGE);
                                        
        while (!isNumber(paintCostString))
        {
            paintCostString = JOptionPane.showInputDialog(null,
                                            "Not a valid value. Please enter paint price per gallon:",
                                            "Paint Cost Calculator",
                                            JOptionPane.INFORMATION_MESSAGE);
        }
        paintCost = Double.parseDouble(paintCostString);
        return paintCost;
    }

    public static double getLength()
    {
        //local variables
        String lengthString = "";
        double length = 0.0;

        lengthString = JOptionPane.showInputDialog(null,
                                    "Room/house length:",
                                    "Paint Cost Calculator",
                                    JOptionPane.INFORMATION_MESSAGE);
        
        while (!isNumber(lengthString))
        {
            lengthString = JOptionPane.showInputDialog(null,
                                        "Not a valid value. Please enter room/house length:",
                                        "Paint Cost Calculator",
                                        JOptionPane.INFORMATION_MESSAGE);                           
        }
        length = Double.parseDouble(lengthString);
        return length;
    }

    public static double getWidth()
    {
        //local variables
        String widthString = "";
        double width = 0.0;

        widthString = JOptionPane.showInputDialog(null,
                                    "Room/house width:",
                                    "Paint Cost Calculator",
                                    JOptionPane.INFORMATION_MESSAGE);

        while (!isNumber(widthString))
        {
            widthString = JOptionPane.showInputDialog(null,
                                        "Not a valid value. Please enter room/house width:",
                                        "Paint Cost Calculator",
                                        JOptionPane.INFORMATION_MESSAGE);   
        }
        width = Double.parseDouble(widthString);
        return width;
    }

    public static double getHeight()
    {
        //local variables
        String heighString = "";
        double height = 0.0;

        heighString = JOptionPane.showInputDialog(null,
                                    "Room/house height:",
                                    "Paint Cost Calculator",
                                    JOptionPane.INFORMATION_MESSAGE);

        while (!isNumber(heighString))
        {
            heighString = JOptionPane.showInputDialog(null,
                                        "Not a valid value. Please enter room/house height:",
                                        "Paint Cost Calculator",
                                        JOptionPane.INFORMATION_MESSAGE);
        }
        height = Double.parseDouble(heighString);
        return height;
    }

    private static boolean isNumber(String n)
    {
        try
        {
            Double.parseDouble(n);
            return true;
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
    }

    public static double getArea(double length, double width, double height)
    {
        //local variables
        double area = 0.0;

        area = (length * height * 2) + (width * height * 2);
        return area;
    }

    public static double calculatePaintCost(double area, double cost)
    {
        //local variables
        double gallons = 0.0, total = 0.0;

        final int SQFT_PER_GAL = 350;

        gallons = area / SQFT_PER_GAL;
        total = gallons * cost;
        return total;
    }

    public static void printPaintCost(double cost, double area, double total)
    {
        DecimalFormat moneyFormat = new DecimalFormat("$#,###,##0.00");
        DecimalFormat numberFormat = new DecimalFormat("#,###,##0.00");

        JOptionPane.showMessageDialog(null,
            "Paint = " + moneyFormat.format(cost) + " per gallon.\n" +
            "Area of room/house = " + numberFormat.format(area) + "sq ft.\n" +
            "Total = " + moneyFormat.format(total));
    }

   
}