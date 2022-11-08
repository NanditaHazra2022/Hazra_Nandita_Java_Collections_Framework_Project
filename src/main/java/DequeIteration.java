/* Java program to demonstrate
* deque implementation using
* Java in-built class: ArrayDeque
* and iteration of deque using
* Java in-built class: Iterator.*/

// Importing required classes.
import java.util.ArrayDeque;
import java.util.Iterator;

// Main class
public class DequeIteration
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread block.

        // Creating object of ArrayDeque class.
        ArrayDeque<String> aDeque = new ArrayDeque<>();

        // Adding elements to the deque.
        aDeque.addFirst("Discovery of India");
        aDeque.addFirst("Gulliver's travel");
        aDeque.addFirst("Around the world in 80 days");
        aDeque.addLast("Alice in wonderland");

        // Printing the deque on output console.
        System.out.println(
                "\nDeque: "
                + aDeque
        );

        // Iterating the deque.
        System.out.println(
                "\n------Iteration of deque begins------"
        );
        for (Iterator<String> itr = aDeque.iterator();
             itr.hasNext(); ) {
            System.out.println(
                    "\nIterated element of deque: "
                            + itr.next()
            );
            System.out.println(
                    "\nPopped element of deque: "
                            + aDeque.pop()
            );
            System.out.println(
                    "\nSize of deque after popping: "
                            + aDeque.size()
            );
        }
        System.out.println(
                "\n------Iteration of deque ends------"
        );

    }   // End of execution thread block.

}   // End of main class block.