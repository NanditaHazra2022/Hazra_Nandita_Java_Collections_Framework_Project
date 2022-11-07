/* Java program to demonstrate
* overwriting every element in a List
* with the specified value
* by using Java in-built method: Collections.fill()*/

// Importing required classes.
import java.util.ArrayList;
import java.util.Collections;

// Main class.
public class ArrayListFill
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread block.

        // Creating a dynamic array of strings.
        ArrayList<String> fluidList = new ArrayList<>();

        /* Performing bulk operation
        * of adding elements to the dynamic array
        * using Java in-built method. */
        Collections.addAll(fluidList, "Orange juice", "Apple juice", "Pomegranate juice");

        // Printing the created dynamic array.
        System.out.println(
                "Dynamic array: "
                + fluidList
        );

        /* Filling up the dynamic array
        * with one element using Java in-built method. */
        Collections.fill(fluidList, "Tender coconut water");

        // Printing the modified dynamic array.
        System.out.println(
                "\nModified dynamic array: "
                + fluidList
        );

    }   // End of execution thread block.

}   // End of main class block.
