/* Java program to demonstrate
* swap operation on elements
* of dynamic array
* using Java in-built method: Collections.swap() */

// Importing required classes
import java.util.ArrayList;
import java.util.Collections;

// Main class.
public class ArrayListSwap
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread block.

        // Creating dynamic array of strings.
        ArrayList<String> seedList = new ArrayList<>();

        /* Performing bulk operation
        * of adding elements to the dynamic array
        * using Java in-built method. */
        Collections.addAll(seedList,
                "Almond",
                "Walnut",
                "Cashew",
                "Pistachio");

        // Printing on output console the dynamic array.
        System.out.println(
                "Dynamic array: "
                + seedList
        );

        /* Performing swap operation
        * on elements of dynamic array
        * using Java in-built method. */
        Collections.swap(seedList, 0, 2);   // Elements at zeroth and second position are swapped.

        // Printing on the output console the modified dynamic array.
        System.out.println(
                "\nModified dynamic array after swap operation: "
                + seedList
        );

    }   // End of execution thread block.

}   // End of main class block.
