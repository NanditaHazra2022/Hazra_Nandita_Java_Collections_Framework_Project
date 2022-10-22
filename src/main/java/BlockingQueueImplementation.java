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

class Consumer1
        implements Runnable {

    // Reference variable.
    private final BlockingQueue queue;

    // Constructor of Consumer class.
    Consumer1(BlockingQueue q)
    {
        queue = q;
    }

    // Thread.
    public void run() {

        for(int i=1;
            i<=5;
            i++){

            queue.remove(i);

            System.out.println
                    ("Consumer1 queue: "
                            + queue
                            + " --> Thread Id"
                            + Thread.currentThread().getId() );

        }   // End of for loop.

    }
}

class Consumer2
        implements Runnable {

    // Reference variable.
    private final BlockingQueue queue;

    // Constructor of Consumer class.
    Consumer2(BlockingQueue q)
    {
        queue = q;
    }

    // Thread.
    public void run() {

        for(int i=6;
            i<=10;
            i++){

            queue.remove(i);

            System.out.println
                    ("Consumer2 queue: "
                            + queue
                            + " --> Thread Id"
                            + Thread.currentThread().getId() );

        }   // End of for loop.

    }
}


public class BlockingQueueImplementation
{

    public static void main(String[] args)
            throws InterruptedException
    {
        // define capacity of ArrayBlockingQueue
        int capacity = 10;

        // create object of ArrayBlockingQueue
        BlockingQueue<String> q
                = new ArrayBlockingQueue<>(capacity);
        Producer p
                = new Producer(q);
        Consumer1 c1
                = new Consumer1(q);
        Consumer2 c2
                = new Consumer2(q);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
}

