//
// Written by: Mark Trombly
//
import java.util.Scanner;;


class BookDemo
{
 public static void main(String args[])
 {
    //initialize variables
    String cd = "";
    String des = "";
    double pr = 0.0;
    String author = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("\nDeveloper: Mark Trombly");
    System.out.println("Product, Book and BookDemo App:  \n" +
      "\nBook:\n" +
      "Create one private data members:\n" +
      "\n\t1. author (String))\n" +
      
      "\nCreate one setter/mutator methods:\n" +
      "\n\t1. setAuthor\n" +
      
      "\nCreate two getter/accessor methods:\n" +
      "\n\t1. getAuthor\n" +
      "\t2. print (overrides base class print() method)\n" +
      "\nCreate two constructors:\n" +
      "\n\t1. no-par constructor (initializes fields to default values)\n" +
      "\t2. parameterized constructor that accepts four arguments\n" +
      "\nInstantiate two product and two book objects:\n" +
      "\n\t1. one from no-par (aka, no-arg) constructor (that doesn't accept any arguments), displays default values\n" +
      "\t2. one from the parameterized constructor using user-entered data (passing three (product), and four\n" +
      "\t   (book) arguments to its constructor's parameters)\n");

    System.out.println("\n/////Below are *base class default constructor* values (instantiating p1, then using getter methods)://///");
    Product p1 = new Product(); //create default object
    System.out.println("\nCode = " + p1.getCode());
    System.out.println("Description = " + p1.getDescription());
    System.out.printf("Price = $%.2f\n", p1.getPrice());

    System.out.println("\n/////below are *base class* user-entered values (instantiating p2, then using getter methods)://///");

    //get user input
    System.out.print("\nCode: ");
    cd = sc.nextLine();

    System.out.print("Description: ");
    des = sc.nextLine();

    System.out.print("Price: ");
    pr = sc.nextDouble();

    sc.nextLine(); //clears buffer to conlsume '\n' character

    Product p2 = new Product(cd, des, pr);
    //System.out.println("\n/////Getter methods/////");
    System.out.println("\nCode = " + p2.getCode());
    System.out.println("Description = " + p2.getDescription());
    System.out.printf("Price = $%.2f\n", p2.getPrice());

    System.out.println("\n/////Below using setter methods to pass literal values to p2. then print() method to display values://///");
    p2.setCode("xyz789");
    p2.setDescription("Test Widget xyz789");
    p2.setPrice(89.99);

    p2.print();

    System.out.println(); //print blank line

    System.out.print("\n/////Below are *derived class default constructor* values (instantiating b1, then using getter methods)://///");
    Book b1 = new Book();
    System.out.println("\nCode = " + b1.getCode());
    System.out.println("Description = " + b1.getDescription());
    System.out.printf("Price = $%.2f\n" ,b1.getPrice());
    System.out.println("Author = " + b1.getAuthor());

    System.out.println("\nOr using overridden derived class print() method...");
    b1.print();

    System.out.println("\n/////Below are *derived class* user-entered values (instantiating b2, then using getter methods)://///");

    //get user input

    System.out.print("\nCode: ");
    cd = sc.nextLine();

    System.out.print("Description: ");
    des = sc.nextLine();

    System.out.print("Price: ");
    pr = sc.nextDouble();
    sc.nextLine(); //clears buffer to conlsume '\n' character

    System.out.print("Author: ");
    author = sc.nextLine();

    Book b2 = new Book(cd, des, pr, author);
    System.out.println("\nCode = " + b2.getCode());
    System.out.println("Description = " + b2.getDescription());
    System.out.printf("Price = $%.2f\n" ,b2.getPrice());
    System.out.println("Author = " + b2.getAuthor());

    System.out.println("\nOr using derived class print() method...");
    b2.print();
 }
}