package storage;

import java.util.function.BiFunction;

public enum AnalyzeSignAndCalculate {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);


    private String operator;
    private BiFunction<Integer, Integer, Integer> analyzeTwoNumberAndCalculate;

    AnalyzeSignAndCalculate(String sign, BiFunction<Integer, Integer, Integer> analyzeTwoNumberAndCalculate) {
        this.operator = sign;
        this.analyzeTwoNumberAndCalculate = analyzeTwoNumberAndCalculate;
    }

    public int calculate(int num1, int num2) {
        return analyzeTwoNumberAndCalculate.apply(num1, num2);
    }
}
