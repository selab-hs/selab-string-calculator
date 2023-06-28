package service.validation;

import java.util.LinkedList;
import java.util.List;


public class SignValidation {
    List<String> extractSign(List<String> formula) {
        List<String> signs = new LinkedList<>();
        for (int i = 1; i < formula.size(); i += 2)
            signs.add(formula.get(i));
        return signs;
    }

    public boolean signCheckValidate(List<String> formula) {
        String validateSign = "+/*-";
        List<String> signs = extractSign(formula);

        boolean option = signs.stream()
                .allMatch(validateSign::contains);
        return option;
    }
}