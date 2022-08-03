import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public Double calculate(String input) {
        Queue<Number> numbers;
        Queue<Operator> operators;

        numbers = new LinkedList<>();
        operators = new LinkedList<>();
        splitInput(input, numbers, operators);

        Double result = numbers.poll().getNumber();
        while(!numbers.isEmpty()) {
            Double nextNumber = numbers.poll().getNumber();
            Operator sign = operators.poll();
            checkCalculate(nextNumber, sign.getSign());
            result = getCalculate(result, nextNumber, sign);
        }
        return result;
    }

    public void checkCalculate(Double number, String sign) {
        if(sign.equals("/") && number==0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다!");
        }
    }

    public Double getCalculate(Double num1, Double num2, Operator sign) {
        return sign.getOperate().getOperate(num1, num2);
    }

    public static void splitInput(String input, Queue<Number> numbers, Queue<Operator> operators) {
        String[] arr = input.split(" ");
        numbers.offer(new Number(arr[0]));

        for(int i=1;i<arr.length-1;i=i+2) {
            operators.offer(Operator.getOperator(arr[i]));
            numbers.offer(new Number(arr[i+1]));
        }
    }
}
