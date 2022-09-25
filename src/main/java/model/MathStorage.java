package model;

import service.CalculationsUsingOperator;
import service.UserInput;
import service.Validation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static view.ErrorTypeClassification.errorTypeClassification;

public class MathStorage {
    private List<String> formula = null;

    private CalculationsUsingOperator calculationsUsingOperator = new CalculationsUsingOperator();

    private final Validation validation = new Validation();
    private final UserInput userInput = new UserInput();

    public void setFormula(){
        List<String> formula = userInput.input();
        validation.validateCheck(formula);
        this.formula = formula;
    }

    public int calculate(){
        return calculationsUsingOperator.calculateTheWhole(this.formula);
    }

}


