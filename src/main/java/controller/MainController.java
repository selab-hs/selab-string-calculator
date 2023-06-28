package controller;

import dto.AnswerDto;
import dto.ErrorContextDto;
import dto.FormulaDto;

public class MainController {
    private final ViewController viewController = new ViewController();
    private final ErrorController errorController = new ErrorController();
    private final CalculateController calculateController = new CalculateController();

    public void sequence() {
        FormulaDto formulaDto = viewController.inputSequence();
        ErrorContextDto errorContextDto = errorController.errorSequence(formulaDto);
        viewController.errorView(errorContextDto);
        AnswerDto answerDto = calculateController.calculationProcess(formulaDto);
        viewController.answerView(answerDto);
    }
}