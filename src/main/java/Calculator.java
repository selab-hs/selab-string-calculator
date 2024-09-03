public class Calculator {
    public double calculate(String expression) {
        String[] tokens = expression.split(" ");
        double currentResult = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double number = Double.parseDouble(tokens[i + 1]);

            switch (operator) {
                case "+":
                    currentResult += number;
                    break;
                case "-":
                    currentResult -= number;
                    break;
                case "*":
                    currentResult *= number;
                    break;
                case "/":
                    if (number == 0) {
                        throw new ArithmeticException("0으로 나눌 수 없습니다.");
                    }
                    currentResult /= number;
                    break;
                default:
                    System.out.println("지원하지 않는 연산자입니다: " + operator);
                    return 0;
            }
        }
        return currentResult;
    }
}
