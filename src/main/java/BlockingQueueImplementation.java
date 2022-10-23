/* Java program to demonstrate
* BlockingQueue interface.
* There is one producer queue
* and two consumer queues.
* Producer queue will add
* elements to the queue.
* Consumer queues will remove
* elements from the queue. */

// Importing required classes.
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Producer queue class.
class ProdQueue
        implements Runnable
{   // Start of producer queue class

    // Reference variable.
    private final BlockingQueue prodQ;

    // Constructor of Producer queue class.
    ProdQueue(BlockingQueue pQ)
    {
        prodQ = pQ;
    }

    // Thread.
    public void run() {

        // Adding numbers 101 to 108 into the queue.
        for (int i = 101;
             i <= 108;
             i++)
        {   // Start of for loop.
            prodQ.add(i);
        }   // End of for loop.

        // Printing producer queue.
        System.out.println
                (
                        "Producer queue: "
                                + prodQ
                );
    }
}

// Consumer queue-one class.
class Consumer1
        implements Runnable {

    // Reference variable.
    private final BlockingQueue conQ1;

    // Constructor of Consumer queue-one class.
    Consumer1(BlockingQueue cQ1)
    {
        conQ1 = cQ1;
    }

    // Thread.
    public void run() {

        for(int i=101;
            i<=104;
            i=i+2){

            conQ1.remove(i);

            System.out.println
                    ("Consumer1 queue: "
                            + conQ1
                            + " --> Thread Id"
                            + Thread.currentThread().getId() );

        }   // End of for loop.

    }
}

// Consumer queue-two class.
class Consumer2
        implements Runnable {

    // Reference variable.
    private final BlockingQueue conQ2;

    // Constructor of Consumer class.
    Consumer2(BlockingQueue cQ2)
    {
        conQ2 = cQ2;
    }

    // Thread.
    public void run()
    {   // Start of thread.

        for(int i=105;
            i<=108;
            i=i+3)
        {// Start of for loop.

            conQ2.remove(i);

            System.out.println
                    ("Consumer2 queue: "
                            + conQ2
                            + " --> Thread Id"
                            + Thread.currentThread().getId() );

        }   // End of for loop.

    }   // End of thread.

}   // End of Consumer queue-two class.


// Main class.
public class BlockingQueueImplementation
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
            throws InterruptedException
    {   // Start of execution thread.

        // Defining capacity of ArrayBlockingQueue.
        int capacity = 8;

        // Creating object of ArrayBlockingQueue.
        BlockingQueue<String> q
                = new ArrayBlockingQueue<>(capacity);

        // Creating one producer and two consumer queues.
        ProdQueue p
                = new ProdQueue(q);
        Consumer1 c1
                = new Consumer1(q);
        Consumer2 c2
                = new Consumer2(q);

        // Starting threads.
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();

    }   // End of execution thread.

}   // End of main class.

