/* Java program to demonstrate
 * iteration on dynamic array
 * in following three ways:
 *   1. Forward
 *   2. Backward
 *   3. Alternate position */

// Importing required classes.
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;

// Main class.
public class ArrayListIterations
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating dynamic array.
        List<Float> numbers = new ArrayList<>();

        /* Adding elements to dynamic array
         * using bulk operation of add. */
        Collections.addAll(numbers, 1f, 10f, 20.24f, 345f, 5488.32f);

        //--------------------FORWARD ITERATION STARTS-------------------
        /* Creating iterator object
         * and by default the cursor
         * is placed at the start position
         * of the dynamic array. */
        ListIterator<Float> fwdListIterator
                = numbers.listIterator();

        /* Forward iteration using
         * the method to place the cursor
         * to next position starting
         * from the start position
         * of the dynamic array. */
        System.out.println(
                "Forward iteration om dynamic array-> ");
        while (fwdListIterator.hasNext())
        { // Looping until end of dynamic array is reached.

            System.out.println(
                    fwdListIterator.next()); // Placing the cursor to next position of the current one.

        }
        //--------------------FORWARD ITERATION ENDS-------------------

        System.out.println('\n');   // Moving the cursor to print on console to next 2 lines.

        //--------------------BACKWARD ITERATION STARTS-------------------
        /* Backward iteration using
         * the method to place the cursor
         * to previous position starting
         * from the end position
         * of the dynamic array. */

        /* Creating iterator object
         * and positioning the cursor
         * at the end of the dynamic array
         * using size method. */
        ListIterator<Float> bkwdListIterator
                = numbers.listIterator(numbers.size());

        System.out.println(
                "Backward iteration in dynamic array-> ");
        while (bkwdListIterator.hasPrevious())
        {    // Looping until the cursor reaches the start of the dynamic array.

            System.out.println(
                    bkwdListIterator.previous());    // Placing the cursor a position previous to the current one.

        }
        //--------------------BACKWARD ITERATION ENDS-------------------

        System.out.println('\n');   // Moving the cursor to print on console to next 2 lines.

        //--------------------ALTERNATE POSITION ITERATION STARTS-------------------
        /* Creating iterator object
         * and by default the cursor
         * is placed at the start position
         * of the dynamic array. */
        ListIterator <Float> altPosListIterator
                = numbers.listIterator ();

        System.out.println(
                "Iteration of alternate position in dynamic array-> ");
        /* Alternate position iteration
         * is done by using the concept of
         * forward iteration.
         * After the action is taken
         * at a position,
         * the cursor is moved
         * to the next position,
         * where no action is taken
         * and the cursor is then
         * moved to the next position
         * for the action
         * to be taken there. */
        while (altPosListIterator.hasNext ())
        { // Looping until end of dynamic array is reached.

            System.out.println(
                    altPosListIterator.next ());    // Placing the cursor to next position of the current one.

            /* if condition to check
             * whether the cursor
             * has not reached
             * the end of dynamic array. */
            if (altPosListIterator.hasNext ()) {

                /* Moving the cursor
                 * to next position,
                 * where no action
                 * will be taken. */
                altPosListIterator.next ();

            }

        }
        //--------------------ALTERNATE POSITION ITERATION ENDS-------------------

    }   // End of execution thread.

}   // End of main class.
