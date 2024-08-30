package calculator.controller;

import calculator.model.Operator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final Operator operator;
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController(Operator operator, InputView inputView, OutputView outputView) {
        this.operator = operator;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        String[] values = inputView.formulaInput();
        int result = operator.calculate(values);
        outputView.resultOutput(result);
    }
}
