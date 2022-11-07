/* Java program to demonstrate
* determination of disjoint status
* among three dynamic arrays,
* using Java in-built method: Collections.disjoint() */

// Importing required classes.
import java.util.ArrayList;
import java.util.Collections;

// Main class.
public class ArrayListDisjoint
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread block.

        // Creating three dynamic array of strings.
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        /* Performing bulk operation
        * for addition of elements
        * in dynamic array
        * using Java in-built method. */
        Collections.addAll(list1, "Book", "Pen", "Pencil", "Eraser");
        Collections.addAll(list2, "Book", "Laptop", "Smartphone");
        Collections.addAll(list3, "Compass", "Protractor");

        // Printing the three dynamic arrays on output console.
        System.out.println(
                "\nList1: "
                + list1
        );
        System.out.println(
                "\nList2: "
                        + list2
        );
        System.out.println(
                "\nList3: "
                        + list3
        );

        /* Checking if the list are joint or not,
        * using Java in-built method. */
        boolean res1 = Collections.disjoint(list1, list2);
        boolean res2 = Collections.disjoint(list1, list3);
        boolean res3 = Collections.disjoint(list2, list3);

        // Printing result, of the check, on output console.
        System.out.println(
                "\nQ: List1 and list2 are disjoint, true or false? \nAns: "
                + res1
        );
        System.out.println(
                "\nQ: List1 and list3 are disjoint, true or false? \nAns: "
                        + res2
        );
        System.out.println(
                "\nQ: List2 and list3 are disjoint, true or false? \nAns: "
                        + res3
        );

    }   // End of execution thread block.

}   // End of main class block.
