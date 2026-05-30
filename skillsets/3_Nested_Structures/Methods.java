import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Program counts, totals, and averages total number of user-entered exam scores.\n" +
        "Please enter exam scores between 0 and 100, inclusive.\n" +
        "Enter out of range number to end program.\n" +
        "Must *only* permit numeric entry.\n");
    }

    public static void computeScores()
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double total = 0;
        double average = 0;
        double scoreTest = 0;

        List<Double> scores = new ArrayList<>(); // list to store score values

        do{ // get at least one score
            System.out.println();  //print blank line
            System.out.print("Enter exam score: ");
            while (!sc.hasNextDouble()) {
                System.out.print("Not valid number!\n");
                System.out.println(); // blank line
                System.out.print("Please try again. Enter exam score: ");
                sc.next(); 
            }
            scoreTest= sc.nextDouble();
            if (scoreTest >= 0 && scoreTest <= 100){
                count++;
                scores.add(scoreTest);
            }
        } while (scoreTest >= 0 && scoreTest <= 100);
        
        System.out.println();  //print blank line

        //count = 1;
        for (Double score : scores) {
            total += score; // count score total
        }     

        average = total / count; // calculate average
        
        System.out.printf("Count: %d\n", count);
        System.out.printf("Total: %.1f\n", total);
        System.out.printf("Average: %.1f\n", average);

        sc.close();
    }
}