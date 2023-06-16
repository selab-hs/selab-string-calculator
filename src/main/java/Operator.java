import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.regex.Pattern;

public enum Operator {
    PLUS("+", (value,value2) -> value + value2),
    MINUS("-", (value, value2) -> value - value2),
    MULTIPLY("*", (value, value2) -> value * value2),
    DIVIDE("/", (value, value2) -> value / value2);

    private String operator;
    private BiFunction<Integer, Integer, Integer> expression;

    Operator(String operator, BiFunction<Integer, Integer, Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static int calculate(String operator, int num1, int num2) {
        return getOperator(operator).expression.apply(num1, num2);
    }

    static Operator getOperator(String operator) {
        return Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }

    protected static boolean isOperator(String str) {
        String operatorPattern = "[+\\-*/]";
        if (Pattern.matches(operatorPattern, str)) {
            return true;
        } else {
            throw new IllegalArgumentException("Invalid operator: " + str);
        }
    }
}
