import java.util.ArrayList;
import java.util.List;

public class Number {

    private List<Integer> numbers = new ArrayList<>(); //필드

    public Number(List<String> strings) {
        for (String string : strings) {
            validateNumber(string);
        }
    }

    private void validateNumber(String str) {
        if(!(str.matches("^[0-9]*$")))
            throw new RuntimeException("숫자가 아닙니다.");
        numbers.add(Integer.parseInt(str));
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
