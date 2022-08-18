package validatelogic;

import java.util.List;

public class SignValidation implements ValidationCheckLogic {

    ConsoleConfig consoleConfig = new ConsoleConfig();

    @Override
    public void checkValidate(List<String> signs) {
        String validateSign = "+/*-";

        boolean option = signs.stream()
                .allMatch(validateSign::contains);
        if (!option) {
            consoleConfig.signLogic().expressOnConsole();
        }
    }
}
