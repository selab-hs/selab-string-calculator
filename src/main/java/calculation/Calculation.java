package calculation;

import calculator.*;

import java.util.Iterator;

public class Calculation {

    Calculator calculator;

    public Calculation(Calculator calculator) {
        this.calculator = calculator;
        calculation();
    }

    public void calculation() {
        calculator.setResult(calculator.number.poll().getNumber());

        Iterator<String> max = calculator.operator.iterator();

        while (max.hasNext()) {
            calculator.setResult(
                    Operator
                            .getOperator(calculator.operator.poll())
                            .Calculate(calculator.getResult(), calculator.number.poll().getNumber())
            );
        }
    }
}