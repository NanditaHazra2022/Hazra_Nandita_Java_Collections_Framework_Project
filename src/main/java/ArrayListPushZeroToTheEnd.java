/* Java program to
* push zero value element(s)
* to end of
* integer dynamic array. */

// Importing required classes.
import java.util.ArrayList;
import java.util.Scanner;

// Main class.
public class ArrayListPushZeroToTheEnd
{   // Start of main class.

    // Starting point of execution.
    public static void main(String args[])
    {   // Start of thread of execution.

        // Creating object of Scanner class.
        Scanner input = new Scanner(System.in);

        // Taking input of size of integer dynamic array.
        System.out.println("Input size of integer dynamic array-> ");
        int n = input.nextInt();

        // Creating integer dynamic array.
        ArrayList<Integer> modArr = new ArrayList<>(n);

        /* Using for loop to take
        * input of elements for
        * integer dynamic array. */
        for (int i = 0;
             i < n;
             i++) {

            System.out.println("Input element " + i + "-> ");
            modArr.add(i, input.nextInt());

        }

        /* Printing newly created
        * integer dynamic array
        * using for each loop. */
        System.out.println("Newly created integer dynamic array -> ");
        for (Object o : modArr) {

            System.out.print(o + " "); // Elements are printed space apart.
        }

        /* Calling method to move zeroes
        * to end of integer dynamic array. */
        moveZerosToEnd(modArr);

        /* Printing modified
        * integer dynamic array
        * using for each loop. */
        System.out.println('\n'
                + "Modified integer dynamic array with zero pushed to the end-> ");
        for (Object o : modArr) {

            System.out.print(o + " ");  // Elements are printed space apart.

        }

    }

    /* Method to move all zeros
    * to the end of the integer dynamic array. */
    static void moveZerosToEnd(ArrayList<Integer> modArr)
    {   // start of method block

        /* Using for loop to iterate forward
        * in integer dynamic array. */
        for (int i = 0;
             i < modArr.size();
             i++)
        {   // start of main for loop in method block

            /* Checking whether the value
            * of array element is zero. */
            if (modArr.get(i) == 0) {

                /* Assigning index of
                * zero value element to
                * an integer variable. */
                int iZeroVal = i;

                /* Using for loop to iterate forward
                * from the position where zero was found. */
                for (int iStartPosZeroVal = iZeroVal;
                     iStartPosZeroVal < modArr.size();
                     iStartPosZeroVal++)
                {   // start of nested for loop in method block

                    /* Using while loop to move
                    * to the non-zero value element. */
                    while ((iStartPosZeroVal < modArr.size())
                            && (modArr.get(iStartPosZeroVal) == 0)) {

                        iStartPosZeroVal++; // Incrementing index of integer dynamic array.

                    }

                    /* Using if condition to check that
                     * the end of integer dynamic array is not reached. */
                    if (iStartPosZeroVal < modArr.size())
                    { // start of if block

                        /* Assigning non-zero value to
                        * the zero value position of integer dynamic array. */
                        modArr.set(iZeroVal, modArr.get(iStartPosZeroVal));

                        /* Once the non-zero value element
                        * has been assigned to the zero value element position,
                        * the previously held position
                        * of non-zero value element
                        * is updated to zero value. */
                        modArr.set(iStartPosZeroVal, 0);

                        // Incrementing zero value position
                        iZeroVal++;

                    }   // End of if block.

                } // End of nested for loop in method block.

            } // End of main for loop in method block.

        } // End of method block.

    } // End of thread of execution.

} // End of main class.