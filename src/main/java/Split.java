import java.util.ArrayList;
import java.util.List;

public class Split {

    private List<String> operators;
    private List<Integer> numbers;

    public void split(String[] str_arr) {

        operators = new ArrayList<>();
        numbers = new ArrayList<>();

        for(int i = 0; i < str_arr.length; i++) {
            if (i % 2 == 0) {
                validateNumber(str_arr[i]);
            }
            else {
                validateOperator(str_arr[i]);
            }
        }

    }

    public void validateNumber(String str) {
        if(!(str.matches("^[0-9]*$"))) {
            throw new RuntimeException("숫자가 아닙니다.");
        }
        numbers.add(Integer.parseInt(str));
    }

    public void validateOperator(String str) {
        if(!(str.matches("[-+*/]"))) {
            throw new RuntimeException("부호가 아닙니다.");
        }
        operators.add(str);
    }

    public List<String> getOperators(){
        return operators;
    }

    public List<Integer> getNumbers(){
        return numbers;
    }

}
