package sequencelogic;

import calculatelogic.CalculateConfig;
import inputlogic.InputConfig;
import showconsole.ShowAnswer;
import storage.Formula;
import validatelogic.sequence.ValidateConfig;

public class MainSequence {
    static public void sequence(){

        InputConfig inputConfig = new InputConfig();
        ValidateConfig validateConfig = new ValidateConfig();
        Formula formula = new Formula();
        CalculateConfig calculateConfig = new CalculateConfig();
        ShowAnswer showAnswer = new ShowAnswer();


        formula.setFormula(inputConfig.inputLogic().inputFormula());
        validateConfig.validateSequence().order(formula.getFormula());
        showAnswer.showResult(calculateConfig.calculateLogic().calculateAll(formula.getFormula()));
    }
}
