import Controller.*;
import Model.Answer;
import Model.Formula;
import Model.InputFormula;

public class Calculater {
    public static void main(String[] args) {
        ExcutionOrder.sequence();
    }
    class ExcutionOrder{
     static void sequence(){
         InputFormula.UserInput();

         CheckValidate.checkFormula(Formula.getFormula());

         CalculatorLogic.CalculateLogic.calculateFormula(Formula.getFormula());

         View.ExpressAnswer.showAnswer(Answer.getAnswer());
     }
    }
}


