package Operations;
import Stack.MyStack;


public class OperationManager {
    public static void OperationPostFix(MyStack<Integer> stack, Character item){
        String allusecharacters = "+-*/0123456789";
        
        int result = 0;
        if (allusecharacters.contains(item.toString())){
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
                    try {
                        result = stack.pop() / stack.pop();
                    } catch (ArithmeticException e) {
                        throw new ArithmeticException("Division por cero, esto no se puede, nono ");
                    }
                case ' ':
                    break;
                default:
                    stack.push(Character.getNumericValue(item)); // push 
                    break;
            }
        } 
        else {
            throw new IllegalArgumentException("El caracter no es valido");
        }
    }
}