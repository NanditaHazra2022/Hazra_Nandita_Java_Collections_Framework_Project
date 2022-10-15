/* Java program to demonstrate
* Deque implementation
* using ArrayDeque class. */

// Importing required classes.
import java.util.ArrayDeque;
import java.util.Deque;

// Main class.
public class DequeImplementation
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating Deque object.
        Deque<Integer> numDeque = new ArrayDeque<>();

        /* Through the use of for loop
        * adding numbers 1 to 5
        * using addLast method
        * and adding numbers 5 to 1
        * using addFirst method
        * in Deque object. */
        for (int i = 1;
             i <= 5;
             i++)
        {   // Start of for loop.

            numDeque.addLast(i); // Starts adding from the end of Deque object.
            numDeque.addFirst(i); // Starts adding from the head of Deque object.

        }   // End of for loop.

        // Printing elements of the deque.
        System.out.println("Elements of integer deque-> "
                + numDeque);

        // Removing elements from both end of the deque.
        System.out.println("Removed element (head of deque): "
                + numDeque.removeFirst());
        System.out.println("Removed element (end of deque): "
                + numDeque.removeLast());

        // Printing elements of the modified deque.
        System.out.println("Elements of modified integer deque-> "
                + numDeque);

    }   // End of execution thread.

}   // End of main class.
