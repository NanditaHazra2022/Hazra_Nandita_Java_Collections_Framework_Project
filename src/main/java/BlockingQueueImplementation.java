/* Java program to demonstrate
* BlockingQueue interface implementation
* of an eCommerce portal.
* Producer is waiting
* for the confirmation of payment
* and the consumers are waiting
* for shipping.
* It is the responsibility
* of the blocking queue
* to not allow invalid access
* i.e. consume order if nothing
* is produced.
* The producers and consumers
* will run parallel
* so that they process
* everything efficiently
* and the pause mechanism
* will be taken care
* by the blocking queue.  */

// Importing required classes.
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Producer queue class.
class ProdQueue
        implements Runnable
{   // Start of producer queue class

    // Reference variable.
    private final BlockingQueue<String> pQ;

    // Constructor of Producer queue class.
    ProdQueue(BlockingQueue<String> pQ)
    {

        this.pQ = pQ;
    }

    // Thread.
    public void run() {

        pQ.add("Gluten free Black rice 5 kg");
        pQ.add("THE WAR FOR KINDNESS by Jamil Jaki");
        pQ.add("Black board game");
        pQ.add("Green window curtains");

        // Printing producer queue.
        System.out.println
                (
                        "Producer queue: "
                                + pQ
                );
    }
}

// Consumer queue 1 class.
class Consumer1
        implements Runnable
{   // Start of consumer queue 1 class.

    // Reference variable.
    private final BlockingQueue<String> cQ1;

    // Constructor of Consumer queue-one class.
    Consumer1(BlockingQueue<String> cQ1)
    {

        this.cQ1 = cQ1;
    }

    // Thread.
    public void run()
    {   // Start of consumer thread.

        boolean result1 = cQ1.remove("Gluten free Black rice 5 kg");

        System.out.println(
                "Item: 1 shipped (true/false) ? Answer: "
                        + result1
        );

            System.out.println
                    ("Consumer1 queue: "
                            + cQ1
                            + " --> Thread Id"
                            + Thread.currentThread().getId() );

    }   // End of consumer thread.

}   // End of Consumer queue 1 class.

// Consumer queue 2 class.
class Consumer2
        implements Runnable
{   // Start of consumer queue 1 class.

    // Reference variable.
    private final BlockingQueue<String> cQ2;

    // Constructor of Consumer queue-one class.
    Consumer2(BlockingQueue<String> cQ2)
    {
        this.cQ2 = cQ2;
    }

    // Thread.
    public void run()
    {   // Start of consumer thread.

        boolean result2 = cQ2.remove("THE WAR FOR KINDNESS by Jamil Jaki");

        System.out.println(
                "Item: 2 shipped (true/false) ? Answer: "
                        + result2
        );

        System.out.println
                ("Consumer2 queue: "
                        + cQ2
                        + " --> Thread Id"
                        + Thread.currentThread().getId() );

    }   // End of consumer thread.

}   // End of Consumer queue 2 class.

// Consumer queue 3 class.
class Consumer3
        implements Runnable
{   // Start of consumer queue 1 class.

    // Reference variable.
    private final BlockingQueue<String> cQ3;

    // Constructor of Consumer queue-one class.
    Consumer3(BlockingQueue<String> cQ3)
    {
        this.cQ3 = cQ3;
    }

    // Thread.
    public void run()
    {   // Start of consumer thread.

        boolean result3 = cQ3.remove("Black board game");

        System.out.println(
                "Item: 3 shipped (true/false) ? Answer: "
                        + result3
        );

        System.out.println
                ("Consumer3 queue: "
                        + cQ3
                        + " --> Thread Id"
                        + Thread.currentThread().getId() );

    }   // End of consumer thread.

}   // End of Consumer queue 3 class.

// Consumer queue 4 class.
class Consumer4
        implements Runnable
{   // Start of consumer queue 1 class.

    // Reference variable.
    private final BlockingQueue<String> cQ4;

    // Constructor of Consumer queue-one class.
    Consumer4(BlockingQueue<String> cQ4)
    {
        this.cQ4 = cQ4;
    }

    // Thread.
    public void run()
    {   // Start of consumer thread.

        boolean result4 = cQ4.remove("Green window curtains");

        System.out.println(
                "Item: 4 shipped (true/false) ? Answer: "
                + result4
        );

        System.out.println
                ("Consumer4 queue: "
                        + cQ4
                        + " --> Thread Id"
                        + Thread.currentThread().getId() );

    }   // End of consumer thread.

}   // End of Consumer queue 4 class.


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
        Consumer3 c3
                = new Consumer3(q);
        Consumer4 c4
                = new Consumer4(q);


        // Starting threads.
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();

    }   // End of execution thread.

}   // End of main class.

