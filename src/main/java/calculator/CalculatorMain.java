package calculator;

import calculator.controller.CalculatorController;
import calculator.model.Operator;
import calculator.view.InputView;
import calculator.view.OutputView;


public class CalculatorMain {
    public static void main(String[] args) {
        Operator operator = new Operator();
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        CalculatorController controller = new CalculatorController(operator, inputView, outputView);
        controller.run();
    }
}