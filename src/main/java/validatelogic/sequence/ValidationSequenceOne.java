package validatelogic.sequence;

import validatelogic.*;

import java.util.List;

public class ValidationSequenceOne implements ValidationSequence {

    FormulaExtraction formulaExtraction = new FormulaExtraction();
    ValidationCheckLogic length;
    ValidationCheckLogic number;
    ValidationCheckLogic sign;

    ValidationSequenceOne(){
        this.length = new LengthValidation();
        this.number = new NumberValidation();
        this.sign = new SignValidation();
    }

    public void order(List<String> formula){

        formulaExtraction.extractFormula(formula);

        length.checkValidate(formula);
        number.checkValidate(formulaExtraction.getNumbers());
        sign.checkValidate(formulaExtraction.getSigns());

    }
}
