import java.util.List;

public class Main {
    public static void main(String[] args) {

        Input input = new Input();
        Split split = new Split();

        String[] str = input.inputDataSplit();
        split.split(str);

        List<String> operators = split.getOperators();
        List<Integer> numbers = split.getNumbers();

        int sum = Calculator.calculate(numbers, operators);

        Output output = new Output();
        output.output(sum);

    }
}