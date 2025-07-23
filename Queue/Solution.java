import java.util.ArrayDeque;
import java.util.Deque;

// Note: A Queue is a FIFO "First In, First Out" principle data structure
// Note: A Deque (pronounced "Deck") is a double-ended queue that can be pointed
//       from the first element to the last element of a queue, hence deque.
public class Solution{
    public static void main(String [] args){
        System.out.printf("%s \n\n", "Showcasing the queue data structure:");
        Deque<String> queue = new ArrayDeque<>();

        // Offer (Add) item to back of queue
        queue.offer("First element");
        queue.offer("Second element");
        queue.offer("Third element");

        // Poll (Remove) item from the front of queue
        queue.poll();   // Polls "First element" element

        // Peek (View) item at the front of the queue
        // [] Peeks "Second element" element since its the front
        System.out.println(queue.peek());

        System.out.println("Now showcasing the deque data structure: \n");

        Deque<Integer> deque = new ArrayDeque<>();

        // OfferFirst (Add front) item to front of deque shifting everything
        // [] Think of offerFirst() as someone cutting the line
        deque.offerFirst(1);    // [1]
        deque.offerFirst(2);    // [2, 1] 2 is now in the front

        // OfferLast (Add back) item to back of deque
        deque.offerLast(3); // [2, 1, 3] structure with 2 still first

        // PollFirst (Remove front) item from front of deque
        deque.pollFirst();  // Removes the 2 element
        
        // PollLast (Remove back) item from back of deque
        deque.pollLast();   // Removes the 3 element

        // PeekFirst (View) item at the front of the deque
        // [] Peeks the Integer 1 element since it's last element remaining
        Integer peekDeque = deque.peekFirst();
        System.out.printf("%s %s", peekDeque, "is the front element \n");

        // PeekLast (Last) item at the back of the deque
        // [] Peeks Integer 2 element still since its only remaining element
        System.out.println(deque.peekLast());
    }
}
