import java.util.Scanner;
//
// Written by M.Trombly
//
public class Methods
{

    static final Scanner sc = new Scanner(System.in);

    public static void getRequirements()
    {
        //display operational messages
        System.out.println( "Developer: Mark Trombly");
        System.out.println( "Program determines whether user-entered value is alpha, numeric, or special character.\n" +
                            "References:\n" +
                            "ASCII Background: https://en.wikipedia.org/wiki/ASCII\n" +
                            "ASCII Character Table: https://www.ascii-code.com/\n" +
                            "Lookup Tables: https://www.lookuptables.com/");

        System.out.println();  //print blank line
    }

    public static void determnieChar()
    {
       Scanner sc = new Scanner(System.in);
       char ch = ' ';

       System.out.print("Enter character: ");
       ch = sc.next().charAt(0);

       if((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z'))
          {
            System.out.println(ch + " is alpha. ASCII value: " + (int) ch);
          }
        else if(ch >= '0' && ch <= '9')
          {
            System.out.println(ch + " is numeric ASCII value: " + (int) ch);
          }
        else
          {
            System.out.println(ch + " is special character. ASCII value: " + (int) ch);
          }
          sc.close();
    }
}