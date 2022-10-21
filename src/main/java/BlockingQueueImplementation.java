import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer
        implements Runnable
{

    // Reference variable.
    private final BlockingQueue queue;

    // Constructor of Producer class.
    Producer(BlockingQueue q)
    {
        queue = q;
    }

    // Thread.
    public void run() {

        // Adding numbers 1 to 10, to the queue.
        for (int i = 1;
             i <= 10;
             i++) {   // Start of for loop.
            queue.add(i);
        }   // End of for loop.

        // Printing producer queue.
        System.out.println
                (
                        "Producer queue: "
                                + queue
                );
    }
}

class Consumer
        implements Runnable {

    // Reference variable.
    private final BlockingQueue queue;

    // Constructor of Consumer class.
    Consumer(BlockingQueue q)
    {
        queue = q;
    }

    // Thread.
    public void run() {

        // Adding numbers 101 to 200, to the queue.
        for (int i = 101;
             i <= 200;
             i++) {   // Start of for loop.
            queue.add(i);
        }   // End of for loop.

        // Printing consumer queue.
        System.out.println
                (
                        "Consumer queue: "
                                + queue
                );
    }
}

public class BlockingQueueImplementation
{

    public void main(String[] args)
            throws InterruptedException
    {
        // define capacity of ArrayBlockingQueue
        int capacity = 10;

        // create object of ArrayBlockingQueue
        BlockingQueue<String> q
                = new ArrayBlockingQueue<>(capacity);
        Producer p
                = new Producer(q);
        Consumer c1
                = new Consumer(q);
        Consumer c2
                = new Consumer(q);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
}

