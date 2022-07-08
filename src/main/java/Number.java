import java.util.ArrayList;
import java.util.List;

public class Number {

    private List<Integer> numbers = new ArrayList<>();

    public void validateNumber(String str) {
        if(!(str.matches("^[0-9]*$"))) {
            throw new RuntimeException("숫자가 아닙니다.");
        }
        numbers.add(Integer.parseInt(str));
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
