public class Calculator {
    protected static String[] inputOperator = {};
    protected Number inputNum;

    public Calculator(String input) {
        CheckNumOperator checkNumOperator = new CheckNumOperator(input);
    }

    public static int getResult(){
        int calcResult = Number.number[0];
        for (int i = 0; i < inputOperator.length; i++) {
            calcResult = Operator.calculate(inputOperator[i], calcResult, Number.number[i+1]);
        }
        return calcResult;
    }
}
