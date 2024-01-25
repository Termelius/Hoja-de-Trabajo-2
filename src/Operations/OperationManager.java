package Operations;
import Stack.PostFixStack;

public class OperationManager {
    public static void OperationPostFix(PostFixStack<Integer> stack, Character item){
        int result = 0;
        switch (item) {
            case '+':
                result = stack.pop() + stack.pop();
                System.err.println(result);
                stack.push(result);
                break;
            case '-':
                result = stack.pop() - Character.getNumericValue(stack.pop());
                System.out.println(result);
                stack.push(result);
                break;
            case '*':
                result = stack.pop() * stack.pop();
                System.out.println(result);
                stack.push(result);
                break;
            case '/':
                result = stack.pop() / stack.pop();
                System.out.println(result);
                stack.push(result);
                break;
            case ' ':
                break;
            default:
                stack.push(Character.getNumericValue(item)); // push
                break;
        }
    }
}