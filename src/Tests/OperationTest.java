package Tests;

import Stack.PostFixStack;
import Operations.OperationManager;

import org.junit.Test;
import static org.junit.Assert.*;

public class OperationTest {
    @Test
    public void testOperationPostFix() {
        PostFixStack<Integer> stack = new PostFixStack<Integer>();
        String postfix = "12+4*3+";
        int result = 0;
        for (int i = 0; i < postfix.length(); i++) {
            OperationManager.OperationPostFix(stack, postfix.charAt(i));
        }
        assertEquals(15, stack.pop().intValue());
    }
}
