/* Java program to demonstrate
* determination of frequency of occurrences
* of elements in a dynamic array
* using Java in-built method: Collections.frequency() */

// Importing required classes.
import java.util.ArrayList;
import java.util.Collections;

// Main class.
public class ArrayListFrequency
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread block.

        // Creating dynamic array of strings.
        ArrayList<String> cList = new ArrayList<>();

        /* Performing bulk operation
        * for addition of elements in dynamic array
        * using Java in-built method. */
        Collections.addAll(cList,
                "Bat",
                "Ball",
                "Ball",
                "Ball",
                "Ball",
                "Ball",
                "Ball");

        // Printing the dynamic array on output console.
        System.out.println(
                "Dynamic array: "
                + cList
        );

        /* Determining frequency of occurrence
        * of each element in the dynamic array
        * using Java in-built method. */
        int fBat = Collections.frequency(cList, "Bat");
        int fBall = Collections.frequency(cList, "Ball");

        // Printing the determined frequency on output console.
        System.out.println(
                "\nFrequency of element: Bat = "
                + fBat
        );
        System.out.println(
                "\nFrequency of element: Ball = "
                + fBall
        );

    }   // End of execution thread block.

}   // End of main class block.
