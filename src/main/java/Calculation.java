import java.util.HashMap;

import java.util.Queue;

public class Calculation {
    private Operator operator;
    private Queue<Integer> number;
    private Queue<String> symbol;

    Calculation(Queue number, Queue symbol) {
        this.number = number;
        this.symbol = symbol;
    }

     HashMap<String, Operator> makeOperator = new HashMap<>();

     {
        makeOperator.put("+", Operator.Add);
        makeOperator.put("-", Operator.Minus);
        makeOperator.put("*", Operator.Multiple);
        makeOperator.put("/", Operator.Divide);
    }


    public int calculateLine() {
        int firstNUM = number.poll();
        while (!number.isEmpty()) {
            int secondNUM = number.poll();
            String operator = symbol.poll();
            firstNUM = Calculate(operator, firstNUM, secondNUM);
        }
        System.out.println("result you put : " + firstNUM);
        return firstNUM;
    }

    public int Calculate(String operator, int firstNUM, int secondNUM) {
        return makeOperator.get(operator).calculate.apply(firstNUM, secondNUM);
    }
}
