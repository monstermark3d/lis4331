//
// Written by: Mark Trombly
//
import java.util.Scanner;

class Main
{
 public static void main(String args[])
 {
    //initialize variables
    double validRange = 0.0;
    double validSpeed = 0.0;

    String choice = "";

    Scanner sc = new Scanner(System.in);
   
   Methods.getRequirements();

   do {
      validRange = Methods.validateRange();

      validSpeed = Methods.validateSpeed();

      Methods.calculateTravelTime(validRange, validSpeed);

      System.out.print("\nContinue? (y/n): ");
      choice = sc.next();
      System.out.println();
   }
   while (choice.equalsIgnoreCase("y"));
 }
}