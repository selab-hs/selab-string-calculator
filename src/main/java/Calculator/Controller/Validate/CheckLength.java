package Controller.Validate;

import View.ExpressError.LengthError;

import java.util.List;

public class CheckLength implements CheckValidateData {
    public static void checkFormula(List<String> formula) {
        if (formula.size() % 2 != 1) {
            System.exit(0);
            LengthError.errorAlert();
        }
    }
}
