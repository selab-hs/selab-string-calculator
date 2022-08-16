package sequencelogic;

import calculatelogic.CalculateConfig;
import inputlogic.InputConfig;
import showconsole.ShowAnswer;
import storage.PreserveNecessaryData;
import validatelogic.sequence.ValidateConfig;

public class MainSequence {
    static public void sequence(){

        InputConfig inputConfig = new InputConfig();
        ValidateConfig validateConfig = new ValidateConfig();
        PreserveNecessaryData preserveNecessaryData = new PreserveNecessaryData();
        CalculateConfig calculateConfig = new CalculateConfig();
        ShowAnswer showAnswer = new ShowAnswer();


        preserveNecessaryData.setFormula(inputConfig.inputLogic().inputFormula());
        validateConfig.validateSequence().order(preserveNecessaryData.getFormula());
        showAnswer.showResult(calculateConfig.calculateLogic().calculateAll(preserveNecessaryData.getFormula()));
    }
}
