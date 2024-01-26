package Tests;
import Stack.IStack;
import Stack.PostFixStack;
import org.unitest.

public class StackTest {
    public static void main(String[] args) {
        IStack<Integer> postfixStack = new PostFixStack<>();

        postfixStack.push(5);
        postfixStack.push(10);
        postfixStack.push(3);

        System.out.println("Top element: " + postfixStack.top());
        System.out.println("Popped element: " + postfixStack.pop());
        System.out.println("Is empty: " + postfixStack.isEmpty());
    }
}
