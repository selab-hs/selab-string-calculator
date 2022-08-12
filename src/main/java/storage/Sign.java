package storage;

import java.util.function.BiFunction;

public enum Sign {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);


    private String operator;
    private BiFunction<Integer, Integer, Integer> expression;

    Sign(String sign, BiFunction<Integer, Integer, Integer> expression) {
        this.operator = sign;
        this.expression = expression;
    }

    public int calculate(int num1, int num2) {
        return expression.apply(num1, num2);
    }
}
