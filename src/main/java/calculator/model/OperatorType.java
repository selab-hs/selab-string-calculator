package calculator.model;

public enum OperatorType {
    ADDITION, SUBTRACT, MULTIPLY, DIVIDE;

    public static OperatorType fromString(String symbol) {
        switch (symbol) {
            case "+":
                return ADDITION;
            case "-":
                return SUBTRACT;
            case "*":
                return MULTIPLY;
            case "/":
                return DIVIDE;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }
}