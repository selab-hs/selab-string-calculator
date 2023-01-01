package controller;

import model.CalculateModule;
import service.InputModule;
import service.ValidationModule;
import view.AnswerNotification;

import java.util.List;

public class Controller {
    private final ValidationModule validationModule = new ValidationModule();
    private final CalculateModule calculateModule = new CalculateModule();
    public void start(){
        List<String> formula = new InputModule().input();
        validationModule.validateCheck(formula);

        int answer = calculateModule.calculateTheWhole(formula);
        new AnswerNotification().expressResult(answer);
    }
}