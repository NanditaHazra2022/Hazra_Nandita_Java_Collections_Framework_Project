/* Java program to demonstrate
 * enumeration of Vector class
 * using Enumeration interface.
 * Note: If a thread-safe implementation is not needed,
 * it is recommended to use ArrayList in place of Vector. */

// Importing required classes.
import java.util.Vector;
import java.util.Enumeration;

// Main class.
public class VectorThreadSafeEnumeration
{   // Start of main class.

    // Starting point of execution.
    public static void main (String [] args)
    {

        // Creating a vector.
        Vector <String> stringVector
                = new Vector <> ();

        // Adding elements to the Vector.
        stringVector.add ("running");
        stringVector.add ("a");
        stringVector.add ("marathon");
        stringVector.add ("is");
        stringVector.add ("my");
        stringVector.add ("goal");

        // Creating an object of Enumeration.
        Enumeration <String> enumerationOfVector
                = stringVector.elements();

        // Enumerating vector.
        while (enumerationOfVector.hasMoreElements())
        {   // Start of enumeration.

            // Printing the elements of the vector.
            System.out.println
                    (
                            "Vector enumeration: "
                                    + enumerationOfVector.nextElement()
                    );

        }   // End of enumeration.

    }   // End of execution thread.

}   // End of main class.
