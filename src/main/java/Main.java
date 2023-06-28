public class Main {
    public static void main(String[] args) {
        GetInputValue giv = new GetInputValue();
        Calculator calculator = new Calculator(giv.getInputValue());
        PrintResult printResult = new PrintResult(Calculator.getResult(CheckNumOperator.inputNum));
    }

}
