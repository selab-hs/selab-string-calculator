package storage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static showconsole.ErrorTypeClassification.errorTypeClassification;

public class RetentionOfNecessaryDate {
    private List<String> formula;

    public RetentionOfNecessaryDate() {
        List<String> formula = inputFormula();
        validateCheck(formula);
        this.formula = formula;
    }

    public List<String> getFormula() {
        return formula;
    }

    private List<String> inputFormula() {
        List<String> formula;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str = bufferedReader.readLine();
            formula = Arrays.asList(str.split(" "));
            bufferedReader.close();
            return formula;
        } catch (IOException e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }


    private void validateCheck(List<String> formula){
        List<String> numbers = extractNumber(formula);
        List<String> signs = extractSign(formula);
        lengthCheckValidate(formula);
        numberCheckValidate(numbers);
        signCheckValidate(signs);
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
            System.exit(0);
            errorTypeClassification.lengthLogic();
        }
    }

    private void numberCheckValidate(List<String> numbers) {
        try {
            for (String number : numbers) {
                int intValue = Integer.parseInt(number);
            }
        } catch (Exception e) {
            errorTypeClassification.numberLogic().expressOnConsole();
            System.exit(0);
        }

        for (String number : numbers) {
            if (number.charAt(0) == '0' && !number.equals("0")) {
                errorTypeClassification.numberLogic().expressOnConsole();
                System.exit(0);
            }
        }
    }


    private void signCheckValidate(List<String> signs) {
        String validateSign = "+/*-";

        boolean option = signs.stream()
                .allMatch(validateSign::contains);
        if (!option) {
            errorTypeClassification.signLogic().expressOnConsole();
        }
    }
}


