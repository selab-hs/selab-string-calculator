import java.util.List;

public class Calculator {

    public static int calculate(List<Integer> numbers, List<String> operators) {
        int sum = numbers.get(0);

        for(int i = 0; i < operators.size(); i++) {
            sum = Operation.Operate(sum, numbers.get(i+1), operators.get(i));
        }

        return sum;
    }

}