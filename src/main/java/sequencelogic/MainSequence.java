package sequencelogic;

import calculatelogic.CalculateConfig;
import inputlogic.InputConfig;

import showconsole.AnswerNotification;
import storage.RetentionOfNecessaryDate;
import sequencelogic.validatesequence.ValidationConfig;

public class MainSequence {
    static public void sequence(){

        InputConfig inputConfig = new InputConfig();
        ValidationConfig validationConfig = new ValidationConfig();
        CalculateConfig calculateConfig = new CalculateConfig();
        AnswerNotification answerNotification = new AnswerNotification();
        RetentionOfNecessaryDate retentionOfNecessaryDate = new RetentionOfNecessaryDate(inputConfig.inputLogic().inputFormula());


        validationConfig.validateSequence().order(retentionOfNecessaryDate.getFormula());
        answerNotification.expressResult(calculateConfig.calculateLogic().calculateTheWhole(retentionOfNecessaryDate.getFormula()));
    }
}
