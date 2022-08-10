package Calculator.Controller.Validate;

import Calculator.View.ExpressError.NumberError;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumber implements CheckValidateData {
    static public void checkFormula(List<String> formula) {
        for (int i = 0; i < formula.size(); i += 2) {
            Pattern pattern = Pattern.compile("^[0-9]*$");
            Matcher matcher = pattern.matcher(formula.get(i));
            if (!matcher.find()) {
                System.exit(0);
                NumberError.errorAlert();
            }
        }
    }
}
