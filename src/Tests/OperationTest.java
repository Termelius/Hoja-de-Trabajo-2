package Tests;

import Stack.MyStack;
import Operations.OperationManager;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * pruebas unitarias
 */
public class OperationTest {

    /**
     * analiza la funcionalidad del método
     */
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

