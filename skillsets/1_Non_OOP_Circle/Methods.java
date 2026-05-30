import java.util.Scanner;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Non-OOP program calculates diameter, circumference, and circle area.\n" +
        "Must use Java's built-in PI constant, printf(), and formatted to 2 decimal places.\n" +
        "Must *only* permit numeric entry.\n");

        System.out.println();  //print blank line
    }

    public static void calculateCircle()
    {
        
        System.out.print("Enter circle radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = 0.0;
        double diameter;
        double area;
        double circumference;

        while (!sc.hasNextDouble()) {
            System.out.println("Not valid number!\n");
            System.out.print("Please try again. Enter circle radius: ");
            sc.next(); 
        }

        radius = sc.nextDouble();

        diameter = radius * 2;

        circumference = 2 * Math.PI * radius;

        area = Math.PI * Math.pow(radius, 2);
        
        //System.out.printf("radius:\n" + radius);
        System.out.println();  //print blank line

        System.out.printf("Circle diameter: %.2f\n", diameter);

        System.out.printf("Circumference: %.2f\n", circumference);

        System.out.printf("Area: %.2f\n", area);

        sc.close();
    }
}