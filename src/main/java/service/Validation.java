package service;

import java.util.LinkedList;
import java.util.List;

import static view.ErrorTypeClassification.errorTypeClassification;

public class Validation {

    public void validateCheck(List<String> formula){
        lengthCheckValidate(formula);
        numberCheckValidate(extractNumber(formula));
        signCheckValidate(extractSign(formula));
    }

    private List<String> extractNumber(List<String> formula){
        List<String> numbers = new LinkedList<>();
        for(int i = 0;i<formula.size();i+=2)
            numbers.add(formula.get(i));
        return numbers;
    }

    private List<String> extractSign(List<String> formula){
        List<String> signs = new LinkedList<>();
        for(int i = 1;i<formula.size();i+=2)
            signs.add(formula.get(i));
        return signs;
    }

    private void lengthCheckValidate(List<String> formula) {
        if (formula.size() % 2 == 0) {
            errorTypeClassification.length().expressOnConsole();
            System.exit(0);
        }
    }

    private void numberCheckValidate(List<String> numbers) {
        try {
            for (String number : numbers) {
                int intValue = Integer.parseInt(number);
            }
        } catch (Exception e) {
            errorTypeClassification.number().expressOnConsole();
            System.exit(0);
        }

        for (String number : numbers) {
            if (number.charAt(0) == '0' && !number.equals("0")) {
                errorTypeClassification.number().expressOnConsole();
                System.exit(0);
            }
        }
    }


    private void signCheckValidate(List<String> signs) {
        String validateSign = "+/*-";

        boolean option = signs.stream()
                .allMatch(validateSign::contains);
        if (!option) {
            errorTypeClassification.sign().expressOnConsole();
            System.exit(0);
        }
    }

}
