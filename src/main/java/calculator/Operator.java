package calculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (number1, number2) -> number1 + number2),
    MINUS("-", (number1, number2) -> number1 - number2),
    TIMES("*", (number1, number2) -> number1 * number2),
    DIVISION("/", (number1, number2) -> number1 / number2);
    private final String sign;
    private final BiFunction<Integer, Integer, Integer> doCalculate;

    Operator(String sign, BiFunction<Integer, Integer, Integer> doCalculate) {
        this.sign = sign;
        this.doCalculate = doCalculate;
    }

    public static boolean isOperator(String data) {
        return Arrays.stream(values())
                .anyMatch(operator -> compareSign(operator, data));
    }
    private static boolean compareSign(Operator operator, String data){
        return operator.sign.equals(data);
    }

    public static Operator getOperator(String data){
        return Arrays.stream(values())
                .filter(operator -> compareSign(operator, data))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 연산자를 입력하셨습니다."));
    }

    public int doCalculate(int number1, int number2){
        return doCalculate.apply(number1, number2);
    }
}