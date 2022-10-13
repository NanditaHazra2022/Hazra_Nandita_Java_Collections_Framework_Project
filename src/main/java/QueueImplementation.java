/* Java program to demonstrate
 * implementation of Queue interface. */

//Importing required classes.
import java.util.LinkedList;
import java.util.Queue;

//Main class
public class QueueImplementation
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating integer queue.
        Queue<Integer> numberQueue = new LinkedList<>();

        // Adding numbers 1 to 10, to the queue.
        for (int i = 1;
             i <= 10;
             i++) {

            numberQueue.add(i);

        }

        // Printing elements of the queue.
        System.out.println("Elements of integer queue-> "
                + numberQueue);

        // Removing the head of queue.
        System.out.println("Removed element (head of queue): "
                + numberQueue.remove());

        // Printing modified integer queue
        System.out.println("Elements of modified integer queue-> "
                + numberQueue);

        // To view the head of queue
        System.out.println("Head of queue: "
                + numberQueue.peek());

        /*
        Rest all methods of
        collection interface like size
        can be used with this
        implementation.
        */
        System.out.println("Size of queue: "
                + numberQueue.size());

    }

}

