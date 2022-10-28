/* Java program to demonstrate
 * Set interface implementations
 * using following classes:
 *   1. HashSet
 *   2. LinkedHashSet
 *   3. TreeSet */

// Importing required classes
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Main class.
public class SetImplementations
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        //----------------Set implementation using HashSet starts------------------------
        // Creating HashSet.
        Set<Integer> numbers = new HashSet<>();

        System.out.println("------------------------------------------------");
        System.out.println("Insertion in HashSet is random." + '\n');
        // Inserting elements in HashSet.
        numbers.add(100);
        numbers.add(15);
        numbers.add(350);
        numbers.add(45);
        numbers.add(5000);

        // Printing entries of HashSet.
        System.out.println("Newly created HashSet: "
                + numbers);

        // Removing element from HashSet.
        System.out.println(
                "The number 15 is removed from HashSet. true/false? "
                + numbers.remove(15)
        );

        // Accessing entries of modified HashSet.
        System.out.println("Modified HashSet after removal of number 15: "
                + numbers);

        System.out.println("------------------------------------------------" + '\n');
        //----------------Set implementation using HashSet ends------------------------

        //----------------Set implementation using LinkedHashSet starts------------------------
        // Creating LinkedHashSet.
        Set<Integer> numbers1 = new LinkedHashSet<>();

        System.out.println("------------------------------------------------");
        System.out.println("Insertion in LinkedHashSet is sequential." + '\n');
        // Inserting elements in LinkedHashSet.
        numbers1.add(100);
        numbers1.add(15);
        numbers1.add(350);
        numbers1.add(45);
        numbers1.add(5000);

        // Printing newly created LinkedHashMap.
        System.out.println("Newly created LinkedHashMap: "
                + numbers1);

        // Removing element from LinkedHashSet.
        System.out.println(
                "The number 15 is removed from LinkedHashSet. true/false? "
                        + numbers1.remove(15)
        );

        // Accessing entries of modified HashSet.
        System.out.println("Modified LinkedHashSet after removal of number 15: "
                + numbers1);

        System.out.println("------------------------------------------------" + '\n');
        //----------------Set implementation using LinkedHashSet ends------------------------

        //----------------Set implementation using TreeSet starts------------------------
        // Creating TreeSet.
        Set<Integer> numbers2 = new TreeSet<>();

        System.out.println("------------------------------------------------");
        System.out.println("Insertion in TreeSet is sorted." + '\n');
        // Inserting elements in TreeSet.
        numbers2.add(100);
        numbers2.add(15);
        numbers2.add(350);
        numbers2.add(45);
        numbers2.add(5000);
        numbers2.add(350);  // This integer will be not inserted in the TreeSet as it is a duplicate.

        System.out.println("Newly created TreeSet: "
                + numbers2);

        // Removing element from TreeSet.
        System.out.println(
                "The number 15 is removed from TreeSet. true/false? "
                        + numbers2.remove(15)
        );

        // Accessing entries of modified HashSet.
        System.out.println("Modified TreeSet after removal of number 15: "
                + numbers2);

        System.out.println("------------------------------------------------" + '\n');
        //----------------Set implementation using TreeSet ends------------------------

        System.out.println("------------------------------------------------");

    }   // End of execution thread.

}   // End of main class.
