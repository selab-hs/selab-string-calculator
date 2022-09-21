package CalcController;

import CalcView.*;
import Calculator.*;

public class Controller {
    private final CalcAnswer calcAnswer = new CalcAnswer();
    private final CalcQuestion calcQuestion = new CalcQuestion();
    private final CalcMainHandling calcMainHandling = new CalcMainHandling();

    public void flowCalc() {
        calcQuestion.askUserFormula();
        calcMainHandling.inputQuiries();
        calcMainHandling.refineMixedValue();
        calcAnswer.showCalAnswer(calcMainHandling.calculate());
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.flowCalc();
    }
}
