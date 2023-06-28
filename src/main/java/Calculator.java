import java.util.ArrayList;

public class Calculator {
    public Calculator(String input) {
        CheckNumOperator checkNumOperator = new CheckNumOperator(input);
    }

    public static int getResult(ArrayList<Integer> number){
        int calcResult = number.get(0);
        for (int i = 0; i < CheckNumOperator.inputOperator.size(); i++) {
            calcResult = Operator.calculate(CheckNumOperator.inputOperator.get(i), calcResult, number.get(i+1));
        }
        return calcResult;
    }
}