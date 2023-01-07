package controller;

import dto.AnswerDto;
import dto.ErrorContextDto;
import dto.FormulaDto;
import service.DivideService;
import view.AnswerViewer;
import view.ErrorViewer;
import view.InputViewer;

public class ViewController {
    private final ErrorViewer errorViewer = new ErrorViewer();
    private final AnswerViewer answerViewer = new AnswerViewer();

    protected FormulaDto inputSequence() {
        String userInput = new InputViewer().input();

        return new FormulaDto(new DivideService().divideInput(userInput));
    }

    protected void errorView(ErrorContextDto errorContextDto) {
        errorViewer.ErrorAlert(errorContextDto);
    }

    protected void answerView(AnswerDto answerDto) {
        answerViewer.expressResult(answerDto);
    }
}