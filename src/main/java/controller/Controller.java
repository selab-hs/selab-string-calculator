package controller;

import model.MathStorage;
import service.Calculate;
import view.AnswerNotification;

public class Controller {
    MathStorage mathStorage = new MathStorage();
    AnswerNotification answerNotification = new AnswerNotification();

    public void calculateRequest(){
        inputFormula();
        calculate();
    }
    private void inputFormula(){
        mathStorage.setFormula();
    }

    private void calculate(){
        int answer = mathStorage.calculate.calculateLogic().calculateTheWhole(mathStorage.getFormula());
        showAnswer(answer);
    }
    private void showAnswer(int answer){
        answerNotification.expressResult(answer);
    }
}
