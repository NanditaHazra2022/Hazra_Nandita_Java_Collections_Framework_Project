/* Java program to demonstrate
* sorting of dynamic array
* in following ways:
* 1. Descending sorting by
* use of methods: Collections.sort()
* and Comparator.reverseOrder()
* 2. Ascending sorting by
* use of method: Collections.sort() */

// Importing required classes.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

// Main class
public class ArrayListDescSort
{   // Start of main class block.

    // Starting point of program execution.
    public static void main(String[] args)
    {   // Start of execution thread block.

        // Creating dynamic array of integers.
        ArrayList<Integer> arr
                = new ArrayList<>();

        // Adding elements to the dynamic array.
        Collections.addAll(arr, // Bulk operation
                1000,
                200,
                500,
                700,
                400);

        // Printing the dynamic array as it is.
        System.out.println(
                "Elements of the dynamic array before sorting: "
                + arr
        );

        // Sorting the dynamic array in descending order.
        Collections.sort(arr, Comparator.reverseOrder());

        // Printing the dynamic array after descending sorting.
        System.out.println(
                "Elements of the dynamic array after descending sorting: "
                + arr
        );

        // Sorting the dynamic array in ascending order.
        Collections.sort(arr);

        // Printing the dynamic array after ascending sorting.
        System.out.println(
                "Elements of the dynamic array after ascending sorting: "
                + arr
        );

    }   // End of execution thread block.

}   // End of main class block.
