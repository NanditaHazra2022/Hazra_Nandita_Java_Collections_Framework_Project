/* Java program to demonstrate
* Map interface implementations
* using following classes:
*   1. HashMap
*   2. LinkedHashMap
*   3. TreeMap */

// Importing required classes
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

// Main class.
class MapImplementations
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        //----------------Map implementation using HashMap starts------------------------
        // Creating HashMap.
        Map<String, Integer> numbers = new HashMap<>();

        System.out.println("------------------------------------------------");
        System.out.println("Insertion in HashMap is random." + '\n');
        // Inserting elements in HashMap.
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        // Printing entries of HashMap.
        System.out.println("Newly created HashMap: "
                + numbers);

        // Accessing keys of HashMap.
        System.out.println("Keys of HashMap: "
                + numbers.keySet());

        // Accessing values of HashMap.
        System.out.println("Values of HashMap: "
                + numbers.values());

        // Accessing Set view of HashMap.
        System.out.println("Set view of HashMap: "
                + numbers.entrySet());

        // Removing elements from HashMap.
        int removedValue
                = numbers.remove("Two");   // The remove method returns the value associated with the key that has been removed.
        System.out.println("Removed value from HashMap: "
                + removedValue);

        // Accessing entries of modified HashMap.
        System.out.println("Modified entries of HashMap: "
                + numbers);

        System.out.println("------------------------------------------------" + '\n');
        //----------------Map implementation using HashMap ends------------------------

        //----------------Map implementation using LinkedHashMap starts------------------------
        // Creating LinkedHashMap.
        Map<String, Integer> numbers1 = new LinkedHashMap<>();

        System.out.println("------------------------------------------------");
        System.out.println("Insertion in LinkedHashMap is sequential." + '\n');
        // Inserting elements in LinkedHashMap.
        numbers1.put("One", 1);
        numbers1.put("Two", 2);
        numbers1.put("Three", 3);
        numbers1.put("Four", 4);
        numbers1.put("Five", 5);

        System.out.println("Newly created LinkedHashMap: "
                + numbers1);

        // Accessing keys of LinkedHashMap.
        System.out.println("Keys of LinkedHashMap: "
                + numbers1.keySet());

        // Accessing values of LinkedHashMap.
        System.out.println("Values of LinkedHashMap: "
                + numbers1.values());

        // Accessing Set view of LinkedHashMap.
        System.out.println("Set view of LinkedHashMap: "
                + numbers1.entrySet());

        // Removing elements from LinkedHashMap.
        int removedValue1
                = numbers1.remove("Two");   // The remove method returns the value associated with the key that has been removed.
        System.out.println("Removed value from LinkedHashMap: "
                + removedValue1);

        // Printing modified LinkedHashMap.
        System.out.println("Modified entries of LinkedHashMap: "
                + numbers1);

        System.out.println("------------------------------------------------" + '\n');
        //----------------Map implementation using LinkedHashMap ends------------------------

        //----------------Map implementation using TreeMap starts------------------------
        // Creating TreeMap.
        Map<String, Integer> numbers2 = new TreeMap<>();

        System.out.println("------------------------------------------------");
        System.out.println("Insertion in TreeMap is alphabetical." + '\n');
        // Inserting elements in TreeMap.
        numbers2.put("One", 1);
        numbers2.put("Two", 2);
        numbers2.put("Three", 3);
        numbers2.put("Four", 4);
        numbers2.put("Five", 5);

        System.out.println("Newly created TreeMap: "
                + numbers2);

        // Accessing keys of TreeMap.
        System.out.println("Keys of TreeMap: "
                + numbers2.keySet());

        // Accessing values of TreeMap.
        System.out.println("Values of TreeMap: "
                + numbers2.values());

        // Accessing Set view of TreeMap.
        System.out.println("Set view of TreeMap: "
                + numbers2.entrySet());

        // Removing element from TreeMap.
        int removedValue2
                = numbers2.remove("Two");   // The remove method returns the value associated with the key that has been removed.
        System.out.println("Removed value from TreeMap: "
                + removedValue2);

        // Printing modified TreeMap.
        System.out.println("Modified entries of TreeMap: "
                + numbers2.entrySet());

        System.out.print("------------------------------------------------");
        //----------------Map implementation using TreeMap ends------------------------

    }   // End of execution thread.

}   // End of main class.
