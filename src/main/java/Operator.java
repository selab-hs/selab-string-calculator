import java.util.ArrayList;
import java.util.List;

public class Operator {

    private List<String> operators = new ArrayList<>();

    public static int Operate(int num1, int num2, String operator) {

            switch (operator) {
                case "+": return num1 + num2;
                case "-": return num1 - num2;
                case "*": return num1 * num2;
                case "/": return num1 / num2;
                default: throw new IllegalArgumentException("잘못되었습니다."); //IllegalArgumentException: 부적절한 인수를 전달했음을 나타냄
            }

    }

    public void validateOperator(String str) {
        if(!(str.matches("[-+*/]"))) {
            throw new RuntimeException("부호가 아닙니다.");
        }
        operators.add(str);
    }

    public List<String> getOperators() {
        return operators;
    }
}
