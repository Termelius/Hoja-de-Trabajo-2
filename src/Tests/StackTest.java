package Tests;

import Stack.PostFixStack;
import org.junit.Test;

public class StackTest {
    @Test
    public void testPush() {
        PostFixStack<Integer> stack = new PostFixStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assert stack.top() == 3;
    }

    @Test
    public void testPop() {
        PostFixStack<Integer> stack = new PostFixStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assert stack.pop() == 3;
        assert stack.pop() == 2;
        assert stack.pop() == 1;
    }

    @Test
    public void testTop() {
        PostFixStack<Integer> stack = new PostFixStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assert stack.top() == 3;
        assert stack.top() == 3;
    }
    

}
