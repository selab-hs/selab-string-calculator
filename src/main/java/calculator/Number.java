package calculator;

import calculatorIO.validity;
import error.NumberError;
import calculator.numberValidation;

public class Number {

    private final int number;

    public Number(Calculator calculator, String number){
        new numberValidation().doValidation(number);
        this.number = Integer.parseInt(number);
        addNumber(calculator,this);
    }

    private void addNumber(Calculator calculator,Number number){
        calculator.number.add(number);
    }

    public int getNumber(){
        return this.number;
    }
}
