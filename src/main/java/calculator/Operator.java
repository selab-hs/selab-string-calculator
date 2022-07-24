package calculator;

import calculation.Plus;
import calculator.operatorValidation;
import error.OperatorError;

public class Operator{

    private final String operator;

    public Operator(Calculator calculator, String operator){
        new operatorValidation().doValidation(operator);
        this.operator = operator;
        addOperator(calculator,this);
    }

    private void addOperator(Calculator calculator,Operator operator){
        calculator.operator.add(operator);
    }

    public String getOperator(){
        return this.operator;
    }

}
