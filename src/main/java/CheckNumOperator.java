import java.util.ArrayList;

public class CheckNumOperator {
    protected static ArrayList<String> inputOperator = new ArrayList<>();
    protected static ArrayList<Integer> inputNum = new ArrayList<>();

    public CheckNumOperator(String input) {
        String[] tokens = input.split(" ");
        pushNumOperator(tokens);
    }

    private void pushNumOperator(String[] tokens) {
        for (int i = 0; i < tokens.length; i++) {
            if (i % 2 == 0) {
                Number.isNum(tokens[i]);
                inputNum.add(Integer.parseInt(tokens[i]));
            } else {
                Operator.isOperator(tokens[i]);
                inputOperator.add(tokens[i]);
            }
        }
    }
}