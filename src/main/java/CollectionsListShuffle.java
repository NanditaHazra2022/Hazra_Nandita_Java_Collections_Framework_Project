/* Java program to demonstrate
* shuffling of elements of dynamic array
* using in-built method
* of Java Collections Framework. */

// Importing required classes.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Main class.
public class CollectionsListShuffle {

    // Starting point of execution.
    public static void main(String[] args) {

        // Creating dynamic array of strings.
        List<String> oopLanguageList = new ArrayList<>();

        /* Adding 6 of the object-oriented
        * programming language to the dynamic array. */
        oopLanguageList.add(0,"Java");
        oopLanguageList.add(1, "C++");
        oopLanguageList.add(2, "Python");
        oopLanguageList.add(3, "Ruby");
        oopLanguageList.add(4, "PHP");
        oopLanguageList.add(5,"TypeScript");

        /* Shuffling dynamic array
        * using in-built method
        * of Java Collections Framework. */
        Collections.shuffle(oopLanguageList, new Random());

        // Printing elements of dynamic array.
        System.out.println(
                "Object-oriented programming language's shuffled list:"
                        +'\n'
                + oopLanguageList);

    }

}
