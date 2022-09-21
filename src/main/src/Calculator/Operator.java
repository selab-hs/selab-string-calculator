package Calculator;

import java.util.function.BiFunction;

public enum Operator {
    Add("+", (firstNUM, secondNUM) -> firstNUM + secondNUM),
    Minus("-", (firstNUM, secondNUM) -> firstNUM - secondNUM),
    Multiple("*", (firstNUM, secondNUM) -> firstNUM * secondNUM),
    Divide("/", (firstNUM, secondNUM) -> firstNUM / secondNUM);
    private String value;
    BiFunction<Integer, Integer, Integer> calculate;

    Operator(String value, BiFunction<Integer, Integer, Integer> calculate) {
        this.value = value;
        this.calculate = calculate;
    }
}
