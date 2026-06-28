//
// Written by: Mark Trombly
//
class Book extends Product
{
    private String author;

    public Book()
    {
        super();
        System.out.println("\nInside book default constructor.");
        //super(); must be called before any other statement or it will generate error!
        author = "John Doe";
    }

    //parameterized constructor
    public Book(String cd, String de, double pr, String au)
    {
        super(cd, de, pr);
        System.out.println("\nInside book constructor with parameters.");

        author = au;
    }

    //getter/setter methods (accessor/mutator methods)
    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String a)
    {
        author = a;
    }

    public void print()
    {
        super.print();
        System.out.println(", Author: " + author);
    }
}