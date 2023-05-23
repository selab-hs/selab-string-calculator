public class Calc {
    public int calc(CheckNumOperator checkNumOperator) {
        int calcResult = checkNumOperator.inputNum[0];
        for (int i = 0; i < checkNumOperator.inputOperator.length; i++) {
            calcResult = Operator.calculate(checkNumOperator.inputOperator[i], calcResult, checkNumOperator.inputNum[i + 1]);
        }
        return calcResult;
    }
}
