/* Java program to demonstrate
* copy operation on lists
* using Java in-built method: Collections.copy() */

// Importing required classes.
import java.util.ArrayList;
import java.util.Collections;

// Main class
public class ArrayListCopy
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread block.

        // Creating two dynamic array of strings.
        ArrayList<String> vegListSrc = new ArrayList<>();
        ArrayList<String> vegListDest = new ArrayList<>();

        /* Performing bulk operation of adding elements
        * to the two dynamic array using Java in-built method. */
        Collections.addAll(vegListSrc,
                "Potato",
                "Carrot");
        Collections.addAll(vegListDest,
                "Onion",
                "Garlic",
                "Turmeric",
                "Ginger",
                "Green peas",
                "Cauliflower",
                "Tomato");

        // Printing the two created dynamic array.
        System.out.println(
                "Source dynamic array: "
                + vegListSrc
        );
        System.out.println(
                "\nDestination dynamic array: "
                + vegListDest
        );

        /* Copying one dynamic array to another
        * using Java in-built method.
        * As the size of destination dynamic array
        * is greater than source dynamic array,
        * not all the elements of destination dynamic array
        * will be overwritten. */
        Collections.copy(vegListDest, vegListSrc);

        // Printing the modified dynamic array.
        System.out.println(
                "\nModified destination dynamic array after copy operation: "
                + vegListDest
        );

    }   // End of execution thread block.

}   // End of main class block.
