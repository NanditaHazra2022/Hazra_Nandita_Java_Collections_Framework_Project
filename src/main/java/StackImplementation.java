/* Java program to demonstrate
* stack implementation.
* Following operations will
* be performed:
* 1. Push elements to create Stack.
* 2. Pop elements from the stack.
* 3. Push elements to the modified stack.
* 4. Find the element on top of stack.
* 5. Find the position of elements in the stack. */

// Importing required class.
import java.util.Stack;

// Main class
public class StackImplementation
{   // Start of main class block.

    // Pushing element on the top of the stack.
    static void stackPush(Stack<Integer> stack)
    {   // Start of pushing elements block.

        // for loop to push 9 elements to the stack.
        for(int i = 1;
            i < 10;
            i++)
        {
            stack.push(i);  // In-built Java method
        }

    }   // End of pushing elements block.

    // Popping element from the top of the stack.
    static void stackPop(Stack<Integer> stack)
    {   // Start of popping elements block.

        // for loop to pop 4 elements from stack.
        for(int i = 1;
            i < 5;
            i++)
        {
            stack.pop();    // In-built Java method.
        }
    }

    // Displaying element on the top of the stack.
    static void stackPeek(Stack<Integer> stack)
    {
        Integer element = stack.peek();   // In-built Java method.
        System.out.println("Element on stack top: " + element);
    }

    // Finding element position in the stack.
    static void stackElemPos(Stack<Integer> stack, int element)
    {   // Start of finding position block.

        int pos = stack.search(element);  // In-built Java method

        // if-else condition to check position exists
        if(pos == -1) {
            System.out.println(
                    "Element "
                            + element
                            +" not found");
        }
        else {
            System.out.println(
                    "Element "
                            + element
                            + " is found at position "
                            + pos
            );
        }

    }   // End of finding position block.

    // Starting point of execution.
    public static void main (String[] args)
    {   // Start of execution thread.

        // Declaring stack.
        Stack<Integer> stack = new Stack<>();

        // Adding elements to stack.
        stackPush(stack);
        System.out.println(
                "The stack after first push operation: "
                        + stack
        );

        // Removing elements from stack.
        stackPop(stack);
        System.out.println(
                "The stack after pop operation of LIFO: "
                        + stack
        );

        // Adding elements to stack.
        stackPush(stack);
        System.out.println(
                "The stack after second push operation: "
                        + stack
        );

        // Finding the element on top of stack.
        stackPeek(stack);

        // Finding the position of elements that exist in stack.
        stackElemPos(stack, 8);
        stackElemPos(stack, 6);

    }

}