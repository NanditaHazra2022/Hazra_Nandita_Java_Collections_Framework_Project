/* Java program to demonstrate
* reversal of dynamic array
* using Java in-built method. */

// Importing required classes.
import java.util.ArrayList;
import java.util.Collections;

// Main class.
public class ArrayListReverse
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread block.

        // Creating dynamic array of strings.
        ArrayList<String> fruitList = new ArrayList<>();

        /* Performing bulk operation
        * of addition of elements to the dynamic array. */
        Collections.addAll(fruitList, "Apple", "Mango", "Papaya", "Banana", "Coconut");

        // Printing the created dynamic array.
        System.out.println(
                "Dynamic array: "
                + fruitList
        );

        /* Using the Java in-built method
        * to reverse the dynamic array. */
        Collections.reverse(fruitList);

        // Printing the reversed dynamic array.
        System.out.println(
                "\nReversed dynamic array: "
                + fruitList
        );

    }   // End of execution thread block.

}   // End of main class block.
