//
// Written by: Mark Trombly
//
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Methods
{

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Developer: Mark Trombly");
        System.out.println("Program writes to and reads from same file.\n" +
        "Write separate lines of text to text file named \"myfile.txt\").\n" +    
        "Include appropriate try/catch blocks.\n");
    }

    public static void writeFile(String myFile)
    {
        //initialize variables

        System.out.println("Writing hard-coded text to file.\n");

        // Try-with-resources automatically closes the writer when the block exits
        try {
            FileWriter fw = new FileWriter(myFile);
            BufferedWriter bw = new BufferedWriter(fw);
            
            //write content to buffer
            bw.write("Fourscore and seven years ago our fathers brought forth,");
            bw.newLine();

            bw.write("on this continent, a new nation, conceived in liberty,");
            bw.newLine();

            bw.write("and dedicated to the proposition that all men are created equal.");

            //close file
            bw.close();
            
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + myFile + "");
          //  e.printStackTrace(); 
        }
    }

    public static void readFile(String yourFile)
    {
        String line = null;
        System.out.println("\nReading from file.");

        // Try-with-resources block automatically closes the reader
        try {
             //Initialize file pointers
            FileReader fr = new FileReader(yourFile);
            
            BufferedReader br = new BufferedReader(fr);

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            //close file
            br.close();
            
        } catch (FileNotFoundException e) {
            // Executed if the file does not exist at the specified path
            System.err.println("Unable to open file '" + yourFile + "' ");
            
        } catch (IOException e) {
            // Executed if any other I/O error occurs while reading the file
            System.err.println("Error: An issue occurred while reading the file.");
            e.printStackTrace();
        }
    }
}