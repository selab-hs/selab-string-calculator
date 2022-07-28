import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public Double calculate(String input) {
        Queue<Double> numbers;
        Queue<String> operators;

        numbers = new LinkedList<>();
        operators = new LinkedList<>();
        splitInput(input, numbers, operators);

        Double result = numbers.poll();
        while(!numbers.isEmpty()) {
            Double nextNumber = numbers.poll();
            String sign = operators.poll();
            checkCalculate(nextNumber, sign);
            result = getCalculate(result, nextNumber, sign);
        }
        return result;
    }

    public void checkCalculate(Double number, String sign) {
        if(!Operator.checkOperator(sign)) {
            throw new RuntimeException("유효하지 않은 연산자입니다!");
        }
        if(sign.equals("/") && number==0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다!");
        }
    }

    public Double getCalculate(Double num1, Double num2, String sign) {
        Operator operator = Operator.getOperator(sign);
        return operator.getOperate().getOperate(num1, num2);
    }

    public static void splitInput(String input, Queue<Double> numbers, Queue<String> operators) {
        String[] arr = input.split(" ");
        numbers.offer(Double.parseDouble(arr[0]));

        for(int i=1;i<arr.length-1;i=i+2) {
            operators.offer(arr[i]);
            numbers.offer(Double.parseDouble(arr[i+1]));
        }
    }
}
