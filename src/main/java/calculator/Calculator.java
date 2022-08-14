package calculator;

import calculation.Calculation;
import view.Input;
import view.Output;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Calculator {
    public int result;
    public List<String> formula;
    public Queue<Number> number = new LinkedList<>();
    public Queue<String> operator = new LinkedList<>();

    public Calculator(){
        formula = Arrays.asList(new Input().Input());
        addNumber();
        addOperator();
        new Calculation(this);
        new Output(result);
    }

    public void setResult(int result){
        this.result = result;
    }

    public int getResult(){
        return this.result;
    }

    private void addNumber(){
        formula.stream()
                .filter(data -> Number.isNumber(data))
                .forEach(data -> number.add(new Number(data)));
    }

    private void addOperator(){
        formula.stream()
                .filter(data -> Operator.isOperator(data))
                .forEach(data -> operator.add(data));
    }
}
