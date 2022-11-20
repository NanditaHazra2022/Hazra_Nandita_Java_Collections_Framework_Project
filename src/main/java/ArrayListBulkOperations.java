/* Java program to demonstrate
 * bulk operation of
 * adding and replacing elements
 * in dynamic array
 * using addAll method
 * and replaceAll method respectively. */

// Importing required classes.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class.
public class ArrayListBulkOperations
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread block.

        // Creating a string dynamic array.
        List<String> items = new ArrayList<>();

        /* Adding elements to
         * the string dynamic array in bulk. */
        Collections.addAll(items, "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#", "#", "#", "#", "#");

        /* Printing the newly created
         * string dynamic array
         * using for each loop. */
        System.out.println("Newly created string dynamic array-> ");
        for (Object o: items)
        {
            System.out.print(o + " "); // Elements are printed space apart.
        }
        System.out.println('\n'); // Moving cursor to next 2 lines.

        /* Modifying elements of
        * string dynamic array
        * in bulk.*/
        boolean result
                = Collections.replaceAll(items, "#", "*");

        System.out.println(
                "Replaced # with * (true/false) ? Answer: "
                        + result
        );

        /* Printing the modified
         * string dynamic array. */
        System.out.println("\nModified string dynamic array-> ");
        for (Object o: items)
        {
            System.out.print(o + " "); // Elements are printed space apart.
        }


    }   // End of execution thread.

}   // End of main class block.
