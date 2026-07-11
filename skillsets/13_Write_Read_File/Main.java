//
// Written by: Mark Trombly
//

class Main
{
   public static void main(String args[])
   {
      String fileName = "myfile.txt";
      Methods.getRequirements();

      Methods.writeFile(fileName);

      Methods.readFile(fileName);
   }
}