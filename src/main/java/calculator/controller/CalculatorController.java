package calculator.controller;

import calculator.model.Operator;
import calculator.util.FormulaParser;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final Operator operator;
    private final InputView inputView;
    private final OutputView outputView;
    private final FormulaParser formulaParser;

    public CalculatorController(Operator operator, InputView inputView, OutputView outputView, FormulaParser formulaParser) {
        this.operator = operator;
        this.inputView = inputView;
        this.outputView = outputView;
        this.formulaParser = formulaParser;
    }

    public void calculatorRun() {
        String formula = inputView.formulaInput();
        String[] values = formulaParser.parse(formula);
        int result = operator.calculate(values);
        outputView.resultOutput(result);
    }
}
