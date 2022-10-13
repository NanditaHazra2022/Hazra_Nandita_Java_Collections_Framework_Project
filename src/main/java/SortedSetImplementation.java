/* Java program for
 * implementation of SortedSet interface
 * using TreeSet Class.
 */

// Importing required classes.
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

// Main class.
public class SortedSetImplementation
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating TreeSet.
        SortedSet<Integer> numbers = new TreeSet<>();

        // Inserting elements in the TreeSet
        Collections.addAll(numbers,1, 2, 3, 4, 5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        System.out.println("Newly created TreeSet: "
                + numbers);

        // Accessing the first element of TreeSet.
        System.out.println("First number of TreeSet: "
                + numbers.first());

        // Accessing the last element of TreeSet.
        System.out.println("Last number of TreeSet: "
                + numbers.last());

        // Removing the second element from TreeSet.
        boolean result = numbers.remove(2);
        System.out.println("Is the number 2 removed? " + result);

        // Printing modified TreeSet
        System.out.println("Modified TreeSet: "
                + numbers);

    }   // End of execution thread.

}   // End of main class.
