import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    static Queue<Double> numbers;
    static Queue<String> operators;

    public static Double calculate(String input) {
        numbers = new LinkedList<>();
        operators = new LinkedList<>();
        splitInput(input);

        Double result = numbers.poll();
        while(!numbers.isEmpty()) {
            Double nextNumber = numbers.poll();
            String sign = operators.poll();
            checkCalculateException(nextNumber, sign);
            result = getCalculate(result, nextNumber, sign);
        }
        return result;
    }

    public static void checkCalculateException(Double number, String sign) {
        Operator.checkOperator(sign);
        if(sign.equals("/") && number==0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다!");
        }
    }

    public static Double getCalculate(Double num1, Double num2, String sign) {
        for(Operator operator : Operator.values()) {
            if (operator.getSign().equals(sign)) {
                num1 = operator.getOperate().getOperate(num1, num2);
                break;
            }
        }
        return num1;
    }

    public static void splitInput(String input) {
        String[] arr = input.split(" ");
        numbers.offer(Double.parseDouble(arr[0]));

        for(int i=1;i<arr.length-1;i=i+2) {
            operators.offer(arr[i]);
            numbers.offer(Double.parseDouble(arr[i+1]));
        }
    }
}
