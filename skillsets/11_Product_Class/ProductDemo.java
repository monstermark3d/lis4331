//
// Written by: Mark Trombly
//
import java.util.Scanner;;


class ProductDemo
{
 public static void main(String args[])
 {
    //initialize variables
    String cd = "";
    String des = "";
    double pr = 0.0;
    Scanner sc = new Scanner(System.in);

    System.out.println("\nDeveloper: Mark Trombly");
    System.out.println("Product class and ProductDemo App:  \n" +
    "\nCreate three private data members:\n" +
    "\n\t1. code(alpha numeric)\n" +
    "\t2. description\n" +
    "\t3. price\n" +
    "\nCreate three setter/mutator methods:\n" +
    "\n\t1. setCode\n" +
    "\t2. setDescription\n" +
    "\t3. setPrice\n" +
    "\nCreate four getter/accessor methods:\n" +
    "\n\t1. getCode\n" +
    "\t2. getDescription\n" +
    "\t3. getPrice (formats price)\n" +
    "\t4. print (prints data member values, including formatted price)\n" +
    "\nCreate two constructors:\n" +
    "\n\t1. no-par constructor (initializes fields to default values)\n" +
    "\t2. parameterized constructor that accepts three arguments\n" +
    "\nInstantiate two product objects:\n" +
    "\n\t1. one from no-par (aka, no-arg) constructor (that doesn't accept any arguments), displays default values\n" +
    "\t2. one from the parameterized constructor using user-entered data (passing three arguments to its constructor's parameters)\n");

    System.out.println("\n/////Below are default constructor values://///");
    Product p1 = new Product(); //create default object
    System.out.println("\nCode = " + p1.getCode());
    System.out.println("Description = " + p1.getDescription());
    System.out.printf("Price = %.2f\n", p1.getPrice());

    System.out.println("\n/////below are user-entered values://///");

    //get user input
    System.out.print("\nCode: ");
    cd = sc.nextLine();

    System.out.print("Description: ");
    des = sc.nextLine();

    System.out.print("Price: ");
    pr = sc.nextDouble();

    Product p2 = new Product(cd, des, pr);
    //System.out.println("\n/////Getter methods/////");
    System.out.println("\nCode = " + p2.getCode());
    System.out.println("Description = " + p2.getDescription());
    System.out.printf("Price = %.2f\n", p2.getPrice());

    System.out.println("\n/////Below using setter methods to pass literal values. then print() method to display values://///");
    p2.setCode("xyz789");
    p2.setDescription("Test Widget xyz789");
    p2.setPrice(89.99);

    p2.print();

 }
}