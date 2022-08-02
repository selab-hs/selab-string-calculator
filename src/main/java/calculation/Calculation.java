package calculation;

import calculator.Calculator;
import calculator.OperatorValidation;

public class Calculation {


    public Calculation(Calculator calculator){


        int count;
        int size = calculator.number.size();

        for (count = 0; count < size; count++) {
            if (count == 0) {
                calculator.setResult(calculator.number.poll().getNumber());
                continue;
            }
            String operator = calculator.operator.poll().getOperator();
            if (operator.equals(OperatorValidation.PLUS.getSign())) {
                calculator.setResult(OperatorValidation.PLUS.doCalculate(calculator.getResult(), calculator.number.poll().getNumber()));
            }
            if (operator.equals(OperatorValidation.MINUS.getSign())) {
                calculator.setResult(OperatorValidation.MINUS.doCalculate(calculator.getResult(), calculator.number.poll().getNumber()));
            }
            if (operator.equals(OperatorValidation.TIMES.getSign())) {
                calculator.setResult(OperatorValidation.TIMES.doCalculate(calculator.getResult(), calculator.number.poll().getNumber()));
            }
            if (operator.equals(OperatorValidation.DIVISION.getSign())) {
                calculator.setResult(OperatorValidation.DIVISION.doCalculate(calculator.getResult(), calculator.number.poll().getNumber()));
            }
        }
    }
}
