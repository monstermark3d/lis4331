//
// Written by: Mark Trombly
//

class Main
{
   public static void main(String args[])
   {
      double p = 0.0; // principal
      double r = 0.0; // rate
      int t = 0; // time

      Methods.getRequirements();

      p=Methods.getPrincipal();
      r=Methods.getRate();
      t=Methods.getTime();

      Methods.calculateInterest(p, r, t);
   }
}