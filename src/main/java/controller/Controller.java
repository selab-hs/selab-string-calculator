package controller;

import model.MathStorage;
import view.AnswerNotification;

import java.util.List;

public class Controller {
    private final MathStorage mathStorage = new MathStorage();
    private final AnswerNotification answerNotification = new AnswerNotification();

    public void calculateRequest(){
        inputFormula();
        calculate();
    }
    private void inputFormula(){
        mathStorage.setFormula();
    }

    private void calculate(){
        int answer = mathStorage.calculate();
        showAnswer(answer);
    }
    private void showAnswer(int answer){
        answerNotification.expressResult(answer);
    }
}
