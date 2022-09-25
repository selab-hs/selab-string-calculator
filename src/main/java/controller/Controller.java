package controller;

import model.MathStorage;
import view.AnswerNotification;

import java.util.List;

public class Controller {
    private final MathStorage mathStorage = new MathStorage();
    private final AnswerNotification answerNotification = new AnswerNotification();

    public void calculateRequest(){
        inputFormula();
        int answer = calculate();
        showAnswer(answer);
    }
    private void inputFormula(){
        mathStorage.setFormula();
    }

    private int calculate(){
        return mathStorage.calculate();
    }
    private void showAnswer(int answer){
        answerNotification.expressResult(answer);
    }
}
