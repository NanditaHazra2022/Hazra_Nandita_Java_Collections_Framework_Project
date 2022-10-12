/* Java program to demonstrate
 * bulk operation of
 * adding elements
 * in dynamic array
 * using addAll method. */

// Importing required classes.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class.
public class ArrayListBulkOperations
{   // Start of main thread.

    // Starting point of execution.
    public static void main(String[] args) {

        // Creating a string dynamic array.
        List<String> items = new ArrayList<>();

        /* Adding elements to
         * the string dynamic array in bulk. */
        Collections.addAll(items, "Storybooks",
                "Toys",
                "Puzzles",
                "Musical-instruments",
                "Artwork",
                "Craft-work",
                "Exercising-equipments",
                "Articles",
                "Articles",
                "Articles");

        /* Printing the newly created
         * string dynamic array. */
        System.out.println("Newly created string dynamic array-> ");
        for (Object o: items)
        {

            System.out.print(o + " "); // Elements are printed space apart.

        }
        System.out.println('\n');

        /* Printing the modified
         * string dynamic array. */
        System.out.println("Modified string dynamic array-> ");
        Collections.replaceAll(items, "Articles", "Magazines");

        for (Object o: items)
        {

            System.out.print(o + " "); // Elements are printed space apart.

        }


    }   // End of execution thread.

}   // End of main class.
