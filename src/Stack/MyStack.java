package Stack;

import java.util.Vector;

public class MyStack<G> implements UVGStack<G>{

    private Vector<G> stack;

    public MyStack() {
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

    public G Top() {
        return stack.lastElement();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

}
