package sequencelogic;

import calculatelogic.CalculateConfig;
import inputlogic.InputConfig;
import showconsole.AnswerNotification;
import storage.RetentionOfNecessaryDate;
import validatelogic.sequence.ValidationConfig;

public class MainSequence {
    static public void sequence(){

        InputConfig inputConfig = new InputConfig();
        ValidationConfig validationConfig = new ValidationConfig();
        RetentionOfNecessaryDate retentionOfNecessaryDate = new RetentionOfNecessaryDate();
        CalculateConfig calculateConfig = new CalculateConfig();
        AnswerNotification answerNotification = new AnswerNotification();


        retentionOfNecessaryDate.setFormula(inputConfig.inputLogic().inputFormula());
        validationConfig.validateSequence().order(retentionOfNecessaryDate.getFormula());
        answerNotification.expressResult(calculateConfig.calculateLogic().calculateTheWhole(retentionOfNecessaryDate.getFormula()));
    }
}
