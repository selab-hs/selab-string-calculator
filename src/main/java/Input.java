import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    private List<String> numbers = new ArrayList<>();
    private List<String> operators = new ArrayList<>();

    public String input() {
        System.out.print("입력값: ");
        return new Scanner(System.in).nextLine();
    }

    public String[] inputDataSplit(String str) {
        return str.split(" ");
    }

    public void split(String[] str_arr) {
        for(int i = 0; i < str_arr.length; i++) {
            if (i % 2 == 0)
                numbers.add(str_arr[i]);
            if (i % 2 != 0)
                operators.add(str_arr[i]);
        }
    }

    public List<Integer> getNumbers() {
        return new Number(numbers).getNumbers();
    }

    public List<String> getOperators() {
        return new Operator(operators).getOperators();
    }

}
