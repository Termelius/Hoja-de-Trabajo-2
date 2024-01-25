package debugging;

import Stack.PostFixStack;

public class TryingOperations {
    public static void main(String[] args){
        PostFixStack<Integer> stack = new PostFixStack<Integer>();

        // Test String
        String postfix = "12+4*3+";
        int result = 0;
        for (int i = 0; i < postfix.length(); i++) {
            switch (postfix.charAt(i)) {
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
                    stack.push(Character.getNumericValue(postfix.charAt(i))); // push
                    break;
            }
        }
        System.out.println("Result: " + result);
    }
}
