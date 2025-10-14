import java.util.*;

public class StudentStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");
        stack.push("David");
        stack.push("Emma");

        System.out.println("Stack before pop: " + stack);

        // Pop one name
        String removed = stack.pop();
        System.out.println("Popped name: " + removed);

        // Display remaining stack
        System.out.println("Stack after pop: " + stack);
    }
}
