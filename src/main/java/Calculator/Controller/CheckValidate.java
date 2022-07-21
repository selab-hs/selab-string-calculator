package Controller;
import Controller.Validate.*;
import java.util.List;

public class CheckValidate {
    static public void checkFormula(List<String> formula){
        CheckLength.checkFormula(formula);
        CheckSIGN.checkFormula(formula);
        CheckNumber.checkFormula(formula);
    }
}
