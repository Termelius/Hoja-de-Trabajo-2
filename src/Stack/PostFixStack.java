package Stack;

import java.util.Vector;

public class PostFixStack<G> {

    private Vector<G> stack;

    public PostFixStack() {
        stack = new Vector<G>();
    }

    public void push(G item) {
        stack.add(item);
    }

    public G pop() {
        G item = stack.lastElement();
        stack.remove(stack.size() - 1);
        return item;
    }

    public G top() {
        return stack.lastElement();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
}
