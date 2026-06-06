//get requirements is first 2 lines of code
//follow me
//multiple cursor
//
import java.util.Scanner;
class CalculatePaintCostGUI
{
 public static void main(String args[])
 {
    //call static void methods (ie. no object, non-value returning)
    //init variable(s)
    double cost = 0.0, length = 0.0, width = 0.0, height = 0.0, area = 0.0, total =0.0;


    Methods.getRequirements();
    cost = Methods.getPaintCost();

    length = Methods.getLength();
    width = Methods.getWidth();
    height = Methods.getHeight();
    area = Methods.getArea(length, width, height);

    total = Methods.calculatePaintCost(area, cost);

    Methods.printPaintCost(cost, area, total);
 }
}