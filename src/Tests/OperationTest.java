package Tests;

import Stack.MyStack;
import Operations.OperationManager;

import org.junit.Test;
import static org.junit.Assert.*;

public class OperationTest {
    @Test
    public void testOperationPostFix() {
        MyStack<Integer> stack = new MyStack<Integer>();
        String postfix = "12+4*3+";
        for (int i = 0; i < postfix.length(); i++) {
            OperationManager.OperationPostFix(stack, postfix.charAt(i));
        }
        assertEquals(15, stack.pop().intValue());
    }
}
