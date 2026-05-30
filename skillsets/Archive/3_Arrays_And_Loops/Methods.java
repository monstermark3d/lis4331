import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Program loops through array of stings.\n" +
        "Use following values: dog, cat, bird, fish, insect.\n" +
        "Use following loop structures: for, enhanced for, while, do...while.\n\n" +
        "Note: Pretest loops: for, enhanced for, while. Posttest loop: do...while.");

        System.out.println();  //print blank line
    }

    public static void arraysAndLoops()
    {
        
        //String[] myArray;
        //myArray new String[5];
        String[] myArray = {"dog","cat","bird","fish","insect"};

        System.out.println("for loop:");
        for (int i=0; i<5; i++)
            System.out.println(myArray[i]);
        System.out.println(); // blank line

        System.out.println("Enhanced for loop:");
        for (String myArrayElement : myArray)
            System.out.println(myArrayElement);
        System.out.println(); // blank line

        System.out.println("while loop:");
        int loopCount = 0;
        while (loopCount < myArray.length)
        {
            System.out.println(myArray[loopCount]);
            loopCount++;
        }
        System.out.println(); // blank line

        System.out.println("do...while loop:");
        loopCount = 0;
        do
        {
            System.out.println(myArray[loopCount]);
            loopCount++;
        }
        while (loopCount < myArray.length);
    }
}