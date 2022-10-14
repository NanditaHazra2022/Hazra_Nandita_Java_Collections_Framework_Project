/* Java program to demonstrate
 * usage of dynamic array
 * for partitioning
 * an array in two halves:
 * one with positive numbers
 * and the other with negative numbers. */

// Importing required classes.
import java.util.ArrayList;
import java.util.Scanner;

// Main class.
public class ArrayPartitionPositiveNegativeNumbers
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating object of Scanner class.
        Scanner input = new Scanner(System.in);

        // Taking input of array length.
        System.out.println
                (

                        "Input length of array -> "

                );
        int n = input.nextInt();

        /* Creating array for partitioning,
         * in case input array length
         * is greater than zero. */
        if (n > 0) {

            int[] arr = new int[n];

            /* Adding elements to array
             * using for loop to take inputs
             * for each element of array
             * (Scanner class for taking inputs.). */
            for (int i = 0;
                 i < n;
                 i++) {

                System.out.println
                        (

                                "Input Array element "
                                        + i
                                        + "-> "

                        );

                arr[i] = input.nextInt();

            }

            // Printing newly created array using for-each loop.
            System.out.println
                    (

                            "Newly created array-> "

                    );
            for (Object o : arr)    // for each loop
            {

                System.out.print(o + " ");

            }

            System.out.println('\n');   // Moving cursor to next line.

            /* Calling method to partition array
             * into two halves:
             * One having positive numbers
             * and the other negative numbers. */
            partitionNegativeAndPositive(n, arr);

        }
        else
        {

            System.out.println(

                    "As the input length of array is zero, array cannot be created."

            );

        }

    }

    /* Method to partition negative
     * and positive numbers of array
     * by creation
     * of two dynamic array:
     * first will store the positive numbers
     * and second will store the negative numbers. */
    static void partitionNegativeAndPositive(int n, int arr[]) {

        ArrayList<Integer> arrPositive
                = new ArrayList<>();    // Dynamic array of positive numbers.

        ArrayList<Integer> arrNegative
                = new ArrayList<>();    // Dynamic array of negative numbers.

        /* Using for loop
         * to traverse array
         * to identify if it is positive
         * or negative and build respective
         * dynamic array accordingly. */
        for (int i = 0;
             i < n;
             i++) {

            /* if-else condition to check
             * whether the array element
             * is positive or negative. */
            if (arr[i] > 0) {

                arrPositive.add(arr[i]);    // Positive array element added to positive dynamic array.

            }

            else {

                if (arr[i] < 0)
                {

                    arrNegative.add(arr[i]);    // Negative array element added to negative dynamic array.

                }

            }

        }

        /* Printing the partitioned array
         * using if-else condition
         * and else-if ladder.
         * Positive dynamic array
         * will be printed first,
         * followed by
         * negative dynamic array
         * if the first element
         * is non-negative. */

        // if-else condition to check
        // whether array has only zeroes
        // or otherwise
        if ((arrPositive.size()) == 0 && (arrNegative.size() == 0))
        {   // Start of if-else condition.

            System.out.println
                    (

                            "Array has only zero(s), hence no partitioning."

                    );

        }
        else {
            if (arrPositive.size() == 0) {   // No positive element in array.

                System.out.println(

                        "Array doesn't have positive numbers, hence no partitioning."

                );

            } else if (arrNegative.size() == 0) {   // No negative element in array.

                System.out.println(

                        "Array doesn't have negative numbers, hence no partitioning."

                );

            } else if (arr[0] < 0) {   // First element of array is negative.

                System.out.println(

                        "Negative partitioning of array-> "

                );
                for (Object o : arrNegative) {  // for-each loop

                    System.out.print
                            (
                                    o
                                            + " "  // Negative array elements will be printed space apart.
                            );

                }

                System.out.println(

                        '\n'
                                + "Positive partitioning of array-> "

                );
                for (Object o : arrPositive) {  // for-each loop

                    System.out.print
                            (
                                    o
                                            + " "// Positive array elements will be printed space apart.
                            );

                }

            } else {

                System.out.println(

                        "Positive partitioning of array-> "

                );
                for (Object o : arrPositive) {  // for-each loop

                    System.out.print
                            (
                                    o
                                            + " "// Positive array elements will be printed space apart.
                            );

                }

                System.out.println(

                        '\n'
                                + "Negative partitioning of array-> "

                );
                for (Object o : arrNegative) {  // for-each loop

                    System.out.print
                            (
                                    o
                                            + " "  // Negative array elements will be printed space apart.
                            );

                }

            }   // End of else-if ladder.

        }   // End of if-else condition.

    }   // End of execution thread.

}   // End of main class.
