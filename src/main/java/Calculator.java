import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculator {

    public static int calculate(List<Integer> numbers, List<String> operators) {
        int result = numbers.get(0);

        for(int i = 0; i < operators.size(); i++) {
            result = Operator.Operate(result, numbers.get(i+1), operators.get(i));
        }

        //이런 식으로...? Stream을 어떻게 써야할지 모르겠어요
        //Stream.iterate(result, n -> Operator.Operate(result, numbers.get(n+1), operators.get(n)));

        return result;
    }


}