
import Operations.*;
import Stack.*;
import TxtReader.*;

public class App {
    public static void main(String[] args) throws Exception {
        TxtLoader loader = new TxtLoader();
        String[] lines = loader.loadFile();
        MyStack<Integer> stack = new MyStack<Integer>();
        for (String line : lines) {
            for (Character item : line.toCharArray()) {
                OperationManager.OperationPostFix(stack, item);
            }
            System.out.println(stack.pop());
        }

    }
}
