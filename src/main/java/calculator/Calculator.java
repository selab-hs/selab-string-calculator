package calculator;

import calculation.*;
import calculatorException.nullCheck;
import calculatorException.valueCheck;
import calculatorIO.Input;
import calculatorIO.Output;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public int result;
    public String formula;

    public Queue<Number> number = new LinkedList<>();
    public Queue<Operator> operator = new LinkedList<>();

    public Calculator(){
        new Input(this);
        new nullCheck(this);
        new valueCheck(this);
        new Calculation(this);
        new Output(this);
    }

    public void setFormula(String formula){
        this.formula = formula;
    }

    public String getFormula(){
        return formula;
    }

    public void setResult(int result){
        this.result = result;
    }

    public int getResult(){
        return result;
    }
}
