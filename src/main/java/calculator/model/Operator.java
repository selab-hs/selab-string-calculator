package calculator.model;

public class Operator {

    public int calculate(String[] values) {
        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i += 2) {
            String symbol = values[i];
            int nextNumber = Integer.parseInt(values[i + 1]);
            OperatorType operatorType = OperatorType.fromString(symbol);
            result = operatorType.apply(result, nextNumber);
        }

        return result;
    }
}
