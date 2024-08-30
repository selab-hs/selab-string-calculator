package calculator.model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public enum OperatorType {
    ADDITION("+", (a, b) -> a + b),
    SUBTRACTION("-", (a, b) -> a - b),
    MULTIPLICATION("*", (a, b) -> a * b),
    DIVISION("/", (a, b) -> {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    });

    private static final Map<String, OperatorType> SYMBOL_MAP = new HashMap<>();

    static {
        for (OperatorType type : values()) {
            SYMBOL_MAP.put(type.symbol, type);
        }
    }

    private final String symbol;
    private final BiFunction<Integer, Integer, Integer> operation;

    OperatorType(String symbol, BiFunction<Integer, Integer, Integer> operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public static OperatorType fromString(String symbol) {
        OperatorType type = SYMBOL_MAP.get(symbol);
        if (type == null) {
            throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
        return type;
    }

    public int apply(int a, int b) {
        return operation.apply(a, b);
    }
}