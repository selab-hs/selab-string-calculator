package model;

import service.CalculationsUsingOperator;
import service.UserInput;
import service.Validation;

import java.util.List;


public class MathStorage {
    private List<String> formula = null;

    private CalculationsUsingOperator calculationsUsingOperator = new CalculationsUsingOperator();

    private final Validation validation = new Validation();
    private final UserInput userInput = new UserInput();

    public void setFormula() {
        List<String> formula = userInput.input();
        validation.validateCheck(formula);
        this.formula = formula;
    }

    public int calculate() {
        return calculationsUsingOperator.calculateTheWhole(this.formula);
    }

}


