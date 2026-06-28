//
// Written by: Mark Trombly
//

class Product
{

    //code (alpha numeric)
    //description
    //price

    //instance variables
    private String code;
    private String description;
    private double price;

    //default constructon
    public Product()
    {
        System.out.println("\nInside product default constructor.");
        code = "abc123";
        description = "My Widget";
        price = 49.99;
    }

    public Product(String code, String description, double price)
    {
        System.out.println("\nInside product constructor with parameters.");
        this.code = code;
        this.description = description;
        this.price = price;
    }

    //setters
    //
    //setCode
    //setDescription
    //setPrice
    
    public void setCode(String cd)
    {
        code = cd;
    } 

    public void setDescription(String des)
    {
        description = des;
    }

    public void setPrice(double pr)
    {
        price = pr;
    }

    //getters
    //
    //getCode
    //getDescription
    //getPrice (formats price, see screenshot)
    //print (prints data member values, including formatted price)

    public String getCode()
    {
        return code;
    }

    public String getDescription()
    {
        return description;
    }

    public double getPrice()
    {
        return price;
    }

    public void print()
    {
        //System.out.println("\n\nPrint Method...");
        System.out.printf("\nCode: %s, Description: %s, Price: %.2f\n", code, description, price);
        //System.out.println("\nDescription: " + description);
        //System.out.printf("\nPrice: %.2f\n", price);
    }


    
}