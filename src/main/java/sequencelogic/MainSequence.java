package sequencelogic;

import calculatelogic.CalculateConfig;

import showconsole.AnswerNotification;
import storage.RetentionOfNecessaryDate;

public class MainSequence {
    public final static MainSequence mainSequence = new MainSequence();
    private final CalculateConfig calculateConfig = new CalculateConfig();
    private MainSequence() {
    }
    public void sequence() {
        RetentionOfNecessaryDate retentionOfNecessaryDate = new RetentionOfNecessaryDate();

        int answer = calculateConfig
                .calculateLogic()
                .calculateTheWhole(retentionOfNecessaryDate.getFormula());

        AnswerNotification.answerNotification.expressResult(answer);
    }
}
