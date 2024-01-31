package Operations;
import Stack.MyStack;

public class OperationManager {
    public static void OperationPostFix(MyStack<Integer> stack, Character item){
        String allUseCharacters = "+-*/0123456789";

        int result = 0;
        if (allUseCharacters.contains(item.toString())){
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
                    int divisor = stack.pop();
                    if (divisor != 0) {
                        result = stack.pop() / divisor;
                        stack.push(result);
                    } else {
                        throw new ArithmeticException("División por cero en la expresión.");
                    }
                    break;
                case ' ':
                    break;
                default:
                    stack.push(Character.getNumericValue(item));
                    break;
            }
        } 
        else {
            throw new IllegalArgumentException("El caracter '" + item + "' no es válido en la expresión.");
        }
    }
}
