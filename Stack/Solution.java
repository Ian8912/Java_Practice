// import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

// Note: A Stack is a LIFO "Last In, First Out" principle data structure
public class Solution{
    public static void main(String [] args){
        // Stack<String> myStack = new Stack<>();
        Deque<String> myStack = new ArrayDeque<>();

        // Push elements into the stack
        myStack.push("banana");
        myStack.push("orange");
        myStack.push("mango");

        // Peek the top element in stack, then print it. Should print "mango" if done correctly.
        System.out.println(myStack.peek());

        // Pop second element "orange" from the stack in LIFO order.
        String secondElement = myStack.pop();

        System.out.println(secondElement + " was the second element in the stack that was just popped/removed!");

        // Check if stack is empty and print output. Note: output is a boolean
        boolean firstCheckIfEmpty = myStack.isEmpty();

        System.out.println("True or False, the stack is empty: " + firstCheckIfEmpty);
    }
}
