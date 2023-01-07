package service.validation;

import java.util.LinkedList;
import java.util.List;


public class NumberValidation {
    private List<String> extractNumber(List<String> formula) {
        List<String> numbers = new LinkedList<>();
        for (int i = 0; i < formula.size(); i += 2)
            numbers.add(formula.get(i));
        return numbers;
    }

    public boolean numberCheckValidate(List<String> formula) {

        List<String> numbers = extractNumber(formula);

        try {
            for (String number : numbers) {
                int intValue = Integer.parseInt(number);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        boolean isNumberValidate = true;

        for (String number : numbers) {
            if (number.charAt(0) == '0' && !number.equals("0")) {
                isNumberValidate = false;
                break;
            }
        }
        return isNumberValidate;
    }
}