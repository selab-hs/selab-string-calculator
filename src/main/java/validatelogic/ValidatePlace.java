package validatelogic;

import java.util.List;

public class ValidatePlace implements ValidateLogic {

    ConsoleConfig showConsole = new ConsoleConfig();
    String notNumber = "[0-9]+";

    public void checkValidate(List<String> formula) {
        for (int i = 0; i < formula.size(); i++) {
            if(i %2 == 0) checkNumber(formula.get(i));
            else checkSign(formula.get(i));
        }
    }

    private void checkNumber(String number){
        if(!number.matches(notNumber)){
            showConsole.placeLogic().showConsole();
            System.exit(0);
        }
    }
    private void checkSign(String sign){
        if(sign.matches(notNumber)) {
            showConsole.placeLogic().showConsole();
            System.exit(0);
        }
    }
}
