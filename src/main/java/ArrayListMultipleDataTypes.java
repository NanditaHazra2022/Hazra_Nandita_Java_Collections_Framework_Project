/* Java program to demonstrate
* creation of dynamic array
* with multiple data types,
* and printing the dynamic array
* using for each loop. */

// Importing required class.
import java.util.ArrayList;

// Main class.
public class ArrayListMultipleDataTypes {

    // Starting point of execution.
    public static void main(String[] args) {

        // Creating dynamic array of students
        ArrayList<Student> studentList = new ArrayList<>();

        /* Adding multiple datatype:
        * string and integer
        * for name and roll-number
        * respectively of students
        * in dynamic array.*/
        studentList.add(new Student("Prathap Karaka", 202206001));
        studentList.add(new Student("Sriram R", 202206002));
        studentList.add(new Student("Srikar Immimidisetty", 202206003));
        studentList.add(new Student("Vignesh Chinnadurai", 202206004));
        studentList.add(new Student("Amith Reddy Tadwai", 202206005));
        studentList.add(new Student("Md Hasan Imam", 202206006));
        studentList.add(new Student("Apoorav Misra ", 202206007));
        studentList.add(new Student("Avani Gandhi", 202206008));
        studentList.add(new Student("Sathishkumar Rajendran", 202206009));
        studentList.add(new Student("Hitesh Sonawane", 202206010));
        studentList.add(new Student("Meghna Nookala", 202206011));
        studentList.add(new Student("Ashutosh Patel", 202206012));
        studentList.add(new Student("Ganesh Kharad", 202206013));
        studentList.add(new Student("Jai Pithwa", 202206014));
        studentList.add(new Student("Nandita Hazra", 202206015));

        /* Printing elements of
        * dynamic array of students.*/
        System.out.println("EPGP in Software Development student list: "
        + '\n');
        printStudentList(studentList);

    }

    /* Method to print all elements
    * of dynamic array of students
    * using for each loop */
    public static void printStudentList(ArrayList<Student> students) {

        /* for each loop
        * to iterate forward
        * in dynamic array of students */
        for(Student s : students) {

            System.out.println(s.getDetails());

        }

    }

    // Class to construct dynamic array data
    static class Student {
        private final String name;
        private final int rollNumber;

        // Constructor
        public Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        /* Method to provide
        *  dynamic array of students data.*/
        public String getDetails() {
            return "Name: " + this.name + '\t'
                    + "Roll-number: " + this.rollNumber + '\n';
        }

    }

}
