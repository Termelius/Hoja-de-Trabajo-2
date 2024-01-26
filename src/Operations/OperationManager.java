package Operations;
import Stack.PostFixStack;

public class OperationManager {
    public static void OperationPostFix(PostFixStack<Integer> stack, Character item){
        int result = 0;
        switch (item) {
            case '+':
                result = stack.pop() + stack.pop();
                stack.push(result);
                break;
            case '-':
                result = stack.pop() - Character.getNumericValue(stack.pop());
                stack.push(result);
                break;
            case '*':
                result = stack.pop() * stack.pop();
                stack.push(result);
                break;
            case '/':
                result = stack.pop() / stack.pop();
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