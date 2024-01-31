package Tests;

import org.junit.Test;
import org.junit.Assert;
import Stack.MyStack;

public class StackTest {
    @Test
    public void testTop() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3, stack.Top().intValue());
    }

    @Test
    public void testPop() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3, stack.pop().intValue());
        Assert.assertEquals(2, stack.pop().intValue());
        Assert.assertEquals(1, stack.pop().intValue());
    }
    
}
