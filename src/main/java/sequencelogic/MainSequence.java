package sequencelogic;

import calculatelogic.CalculateConfig;
import inputlogic.InputConfig;
import storage.Formula;

public class MainSequence {
    static public void sequence(){
        InputConfig inputConfig = new InputConfig();
        inputConfig.inputLogic().inputFormula();

        Formula formula = new Formula();

        formula.setFormula(inputConfig.inputLogic().getFactoredFormula());

        CalculateConfig calculateConfig = new CalculateConfig();
        calculateConfig.calculateLogic().calculateAll(formula.getFormula());
    }
}
