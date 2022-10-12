/* Java program to demonstrate
 * copying elements from one dynamic array
 * to another dynamic array
 * using Collections.copy() method. */

// Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class
public class ArrayListCopyMethod
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of thread of execution.

        // Creating destination dynamic array
        List<String> destinationList = new ArrayList<>();

        // Adding elements to destination dynamic array
        destinationList.add("Books");
        destinationList.add("Toys");
        destinationList.add("Puzzles");

        /* Printing destination
         * dynamic array elements
         * using for each loop. */
        System.out.println("The destination dynamic array-> ");
        for (Object o: destinationList)
        {

            System.out.print(o + " ");  // Elements are printed space apart.

        }
        System.out.println('\n');   // Moving cursor to next two lines.

        // Creating source dynamic array.
        List<String> sourceList = new ArrayList<>();

        // Adding elements to source destination array.
        sourceList.add("Music");
        sourceList.add("Dance");

        /* Printing source
         * dynamic array elements
         * using for each loop. */
        System.out.println("The source dynamic array-> ");
        for (Object o: sourceList )
        {

            System.out.print(o + " ");  // Elements are printed space apart.

        }
        System.out.println('\n');   // Moving cursor to next two lines.

        /* Copying the elements
         * from source dynamic array
         * to destination dynamic array. */
        Collections.copy(destinationList, sourceList);

        /* Printing the modified
         * destination dynamic array. */
        System.out.println(
                "The destination dynamic array after copying from source dynamic array-> ");
        for (Object o: destinationList)
        {

            System.out.print(o + " ");  // Elements are printed space apart.

        }

    }   // End of thread of execution.

}   // End of main class.
