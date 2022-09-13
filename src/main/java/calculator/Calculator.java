package calculator;

import calculation.Calculation;
import view.Input;
import view.Output;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

public class Calculator {
    public int result;
    public List<String> formula;
    public Queue<Number> number = new LinkedList<>();
    public Queue<String> operator = new LinkedList<>();

    public Calculator() {
        formula = Arrays.asList(new Input().Input());
        addNumber();
        addOperator();
        new Calculation(this);
        new Output().printOutput(getResult());
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return this.result;
    }

    private void addNumber() {
        IntStream.range(0, formula.size())
                .filter(this::isOdd)
                .forEach(index -> number.add(new Number(formula.get(index))));
    }

    private boolean isOdd(int number) {
        return number % 2 == 0;
    }

    private void addOperator() {
        formula.stream()
                .filter(Operator::isOperator)
                .forEach(data -> operator.add(data));
    }
}
