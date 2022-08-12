package validatelogic;

import showconsole.ShowConsole;
import showconsole.SignError;

import java.util.ArrayList;
import java.util.List;

public class ValidateSign implements ValidateLogic {

    ConsoleConfig consoleConfig = new ConsoleConfig();

    @Override
    public void checkValidate(List<String> formula) {
        List<String> sign = extractSign(formula);
        String validateSign ="+/*-";

        boolean option = sign.stream()
                .allMatch(validateSign::contains);
        if(!option){
            consoleConfig.signLogic().showConsole();
        }
    }

    private List<String> extractSign(List<String> formula) {
        List<String> sign = new ArrayList<>();
        for (int i = 1; i < formula.size(); i += 2) {
            sign.add(formula.get(i));
        }
        return sign;
    }
}
