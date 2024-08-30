package calculator.model;

public class Operator {
    private final Operations operations;

    public Operator() {
        this.operations = new Operations();
    }

    public int calculate(String[] values) {
        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i += 2) {
            OperatorType operatorType = OperatorType.fromString(values[i]);
            int nextNumber = Integer.parseInt(values[i + 1]);

            switch (operatorType) {
                case ADDITION:
                    result = operations.addition(result, nextNumber);
                    break;
                case SUBTRACT:
                    result = operations.subtract(result, nextNumber);
                    break;
                case MULTIPLY:
                    result = operations.multiply(result, nextNumber);
                    break;
                case DIVIDE:
                    result = operations.divide(result, nextNumber);
                    break;
            }
        }
        return result;
    }
}