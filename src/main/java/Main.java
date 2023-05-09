import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        GetInputValue giv = new GetInputValue();
        CheckNumOperator checkNumOperator = new CheckNumOperator(giv.getInputValue());
        Calc.calc(checkNumOperator.inputOperator, checkNumOperator.inputNum);
    }
}

