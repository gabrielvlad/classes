import java.util.ArrayList;
import java.util.LinkedList;

public class PostfixCalculator {

    private LinkedList<Integer> stack;

    public PostfixCalculator() {
        stack = new LinkedList<Integer>();
    }

    public int evaluateExpression(ArrayList<Token> tokenList) {
        stack.clear();
        for (Token token : tokenList) {
            if (token instanceof Operand) {
                stack.push(((Operand) token).getValue());
            } else if (token instanceof Operator) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = applyOperator((Operator) token, operand1, operand2);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid token type: " + token.getClass().getSimpleName());
            }
        }
        return stack.peek();
    }

    private int applyOperator(Operator operator, int operand1, int operand2) {
        switch (operator.getSymbol()) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator.getSymbol());
        }
    }
}

interface Token {}

class Operand implements Token {

    private int value;

    public Operand(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class Operator implements Token {

    private char symbol;

    public Operator(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
