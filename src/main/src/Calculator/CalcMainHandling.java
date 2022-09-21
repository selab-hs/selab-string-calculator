package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class CalcMainHandling {
    static final String NUMBER_CHECK_VALUE = "[0-9]+";
    private Queue<String> QEquation = new LinkedList<>();
    //private Calculator.Operator operator;
    Queue<Integer> number = new LinkedList<>();
    Queue<String> symbol = new LinkedList<>();
    HashMap<String, Operator> makeOperator = new HashMap<>();

    {
        makeOperator.put("+", Operator.Add);
        makeOperator.put("-", Operator.Minus);
        makeOperator.put("*", Operator.Multiple);
        makeOperator.put("/", Operator.Divide);
    }

    public int calculate() {
        int firstNUM = number.poll();
        while (!number.isEmpty()) {
            int secondNUM = number.poll();
            String operator = symbol.poll();
            firstNUM = previouslyCalculate(operator, firstNUM, secondNUM);
        }
        return firstNUM;
    }

    public int previouslyCalculate(String operator, int firstNUM, int secondNUM) {
        return makeOperator.get(operator).calculate.apply(firstNUM, secondNUM);
    }

    public void inputQuiries() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String data = bufferedReader.readLine();
            toArray(data);
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void toArray(String data) {
        String NumSignNum[] = data.split(" ");
        for (String i : NumSignNum) {
            QEquation.add(i);
        }
    }

    public void refineMixedValue() {
        while (!QEquation.isEmpty()) {
            if (QEquation.peek().matches(NUMBER_CHECK_VALUE)) {
                number.add(parseInt(QEquation.poll()));
            }
            symbol.add(QEquation.poll());
        }
    }
}