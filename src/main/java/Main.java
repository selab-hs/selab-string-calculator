import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        GetInputValue giv = new GetInputValue();
        CheckNumOperator checkNumOperator = new CheckNumOperator(giv.getInputValue());
        Calc calc = new Calc();
        PrintResult printResult = new PrintResult(calc.Calc(checkNumOperator));
    }

}

