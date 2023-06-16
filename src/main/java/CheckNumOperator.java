import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CheckNumOperator {
    protected static String[] inputOperator = { };
    protected static int[] inputNum = { };
    protected static int numCount = 0, operatorCount = 0;
    protected static int numIndex = 0,operatorIndex = 0;

    public CheckNumOperator(String input) {
        parseInput(input);
    }

    private void parseInput(String input) {
        String[] tokens = input.split(" ");
        countNumOperator(tokens);
        pushNumOperator(tokens);
    }

    private void countNumOperator(String[] tokens) {
        for (int i = 0; i < tokens.length; i++) {
            if (i % 2 == 0) {
                if (Number.isNum(tokens[i])) {
                    numCount++;
                }
            } else {
                if (Operator.isOperator(tokens[i])) {
                    operatorCount++;
                }
            }
        }
        inputOperator = new String[operatorCount];
        inputNum = new int[numCount];
    }

    private void pushNumOperator(String[] tokens) {
        for (int i = 0; i < tokens.length; i++) {
            if (i % 2 == 0) {
                Number.isNum(tokens[i]);
                inputNum[numIndex] = Integer.parseInt(tokens[i]);
                numIndex++;
            } else {
                Operator.isOperator(tokens[i]);
                inputOperator[operatorIndex] = tokens[i];
                operatorIndex++;
            }
        }
    }

    public static int[] getInputNum() {
        return inputNum;
    }
}