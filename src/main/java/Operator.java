public class Operator {
    public static int calculate(String[] values) {
        Operations operations = new Operations();
        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i += 2) {
            String operator = values[i];
            int nextNumber = Integer.parseInt(values[i + 1]);

            switch (operator) {
                case "+":
                    result = operations.add(result, nextNumber);
                    break;
                case "-":
                    result = operations.subtract(result, nextNumber);
                    break;
                case "*":
                    result = operations.multiply(result, nextNumber);
                    break;
                case "/":
                    result = operations.divide(result, nextNumber);
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    return 0;
            }
        }
        return result;
    }
}