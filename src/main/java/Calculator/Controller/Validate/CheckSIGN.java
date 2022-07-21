package Controller.Validate;

import Model.SIGN;
import View.ExpressError.SIGNError;

import java.util.List;

public class CheckSIGN implements CheckValidateData {
    static public void checkFormula(List<String> formula) {
        String sign = "+-/*";
        for (int i = 1; i < formula.size(); i += 2) {
            if (!sign.contains(formula.get(i))){
                System.exit(0);
                SIGNError.errorAlert();
            }
        }
    }
}
