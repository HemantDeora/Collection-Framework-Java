import java.util.*;

public class StackDemo {
    public static void main(String[] args) {

        // 1. Declaration
        Stack<Integer> stack = new Stack<>();

        // 2. Push (Add Elements)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);

        // 3. Peek (Top Element)
        System.out.println("Top element: " + stack.peek());

        // 4. Pop (Remove Top)
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);

        // 5. Search (Position from top)
        System.out.println("Position of 20: " + stack.search(20));

        // 6. Check Empty
        System.out.println("Is Empty? " + stack.isEmpty());

        // 7. Traverse
        System.out.println("\nTraversal:");
        for(int i : stack){
            System.out.println(i);
        }

        // 8. Using while (pop all elements)
        System.out.println("\nRemoving all elements:");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        /*
        ================= IMPORTANT NOTES =================

        1. Stack follows LIFO (Last In First Out)
        2. push() → add element
        3. pop() → remove top element
        4. peek() → check top without removing
        5. search() → position from top (1-based)

        INTERVIEW POINTS:
        - Stack extends Vector
        - Thread-safe but slow
        - Used in recursion, undo/redo, expression evaluation

        MODERN APPROACH:
        Instead of Stack, use Deque (ArrayDeque)

        Example:
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.pop();

        ONE-LINE:
        Stack = LIFO data structure (Last In First Out)

        ================================================
        */
    }
}