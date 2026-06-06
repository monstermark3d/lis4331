//get requirements is first 2 lines of code
//follow me
//multiple cursor
//
import java.util.Scanner;
class EvenOddGUI
{
 public static void main(String args[])
 {
    //call static void methods (ie. no object, non-value returning)
    //init variable(s)
    int num = 0;
    Methods.getRequirements();
    num = Methods.getNum();
    Methods.printResults(num);
 }
}