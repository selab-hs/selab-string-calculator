package validatelogic;

import java.util.List;

public class LengthValidation implements ValidationCheckLogic {

    ConsoleConfig consoleConfig = new ConsoleConfig();

    @Override
    public void checkValidate(List<String> formula) {
        if(formula.size() %2 == 0){
            System.exit(0);
            consoleConfig.lengthLogic().expressOnConsole();
        }
    }
}
