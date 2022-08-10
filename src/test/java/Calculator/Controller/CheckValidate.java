package Calculator.Controller;

import Calculator.Controller.Validate.CheckLength;
import Calculator.Controller.Validate.CheckNumber;
import Calculator.Controller.Validate.CheckSIGN;

import java.util.List;

public class CheckValidate {
    static public void checkFormula(List<String> formula){
        CheckLength.checkFormula(formula);
        CheckSIGN.checkFormula(formula);
        CheckNumber.checkFormula(formula);
    }
}
