package Model;

import java.util.function.BiFunction;

public enum SIGN {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);


    private String operator;
    private BiFunction<Integer, Integer, Integer> expression;

    SIGN(String operator, BiFunction<Integer, Integer, Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public int mapCalculate(int num1, int num2) {
        return expression.apply(num1, num2);
    }
}



