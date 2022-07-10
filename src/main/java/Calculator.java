import java.util.List;

public class Calculator {

    public static int calculate(List<Integer> numbers, List<String> operators) {
        int result = numbers.get(0);

        for(int i = 0; i < operators.size(); i++) {
            result = Operator.Operate(result, numbers.get(i+1), operators.get(i));
        }

        return result;
    }


}