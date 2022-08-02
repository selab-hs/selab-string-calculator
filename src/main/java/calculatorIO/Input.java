package calculatorIO;

import calculator.Calculator;
import calculator.NumberValidation;
import calculator.Operator;
import calculator.OperatorValidation;
import calculator.Number;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {
    private final Scanner SCANNER = new Scanner(System.in);
    private final String SEPERATOR = " ";

    public Input(Calculator calculator){
        printInputMessage();
        calculator.setFormula(setData());
        String[] splitedFormula = split(calculator.getFormula());
        addOperator(calculator, splitedFormula);
        addNumber(calculator, splitedFormula);
    }

    private void addOperator(Calculator calculator, String[] data){
        List<String> filter = Arrays.asList(data);

        filter.stream()
                .filter(operator -> operator.equals(OperatorValidation.PLUS.getSign()) || operator.equals(OperatorValidation.MINUS.getSign()) || operator.equals(OperatorValidation.TIMES.getSign()) || operator.equals(OperatorValidation.DIVISION.getSign()))
                .forEach(operator -> calculator.operator.add(new Operator(operator)));
    }

    private void addNumber(Calculator calculator, String[] data){
        List<String> filter = Arrays.asList(data);

        filter.stream()
                .filter(number -> new NumberValidation().doValidation(number))
                .forEach(number -> calculator.number.add(new Number(number)));
    }

    private void printInputMessage(){
        System.out.print("식을 입력해주세요 : ");
    }

    private String setData(){
        return SCANNER.nextLine();
    }

    private String[] split(String formula){
        return formula.split(SEPERATOR);
    }
}