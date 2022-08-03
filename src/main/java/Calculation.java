import java.util.HashMap;

import java.util.Queue;
import java.util.function.BiFunction;

public class Calculation {
    Queue<Integer> queueInt;
    Queue<String> queueString;

    Calculation(Queue queueInt, Queue queueString){
        this.queueInt = queueInt;
        this.queueString = queueString;
    }
    static HashMap<String, Calculation.Operator> makeOperator = new HashMap<>();
    static {
        makeOperator.put("+", Calculation.Operator.Add);
        makeOperator.put("-", Calculation.Operator.Minus);
        makeOperator.put("*", Calculation.Operator.Multiple);
        makeOperator.put("/", Calculation.Operator.Divide);
    }

    public enum Operator{
        Add("+",(firstNUM, secondNUM) -> firstNUM + secondNUM),
        Minus("-", (firstNUM, secondNUM) ->firstNUM - secondNUM),
        Multiple("*", (firstNUM, secondNUM) ->firstNUM * secondNUM),/*{
          public int calculate(int firstNUM,int secondNUM){
                return firstNUM * secondNUM;
            }
            */
        Divide("/", (firstNUM, secondNUM) ->firstNUM / secondNUM);
        final String value;
        BiFunction<Integer, Integer, Integer> calculate;
        Operator(String value, BiFunction<Integer, Integer, Integer> calculate){this.value = value; this.calculate = calculate;}
        //public abstract int calculate(int firstNUM, int secondNUM);
    }
    public int CalculateLine(){
        int firstNUM = queueInt.poll();
        while(!queueInt.isEmpty()){
            int secondNUM = queueInt.poll();
            String operator = queueString.poll();
            firstNUM = Calculate(operator, firstNUM, secondNUM);
        }
        System.out.println("result you put : " + firstNUM);
        return firstNUM;
    }
    public int Calculate(String operator, int firstNUM, int secondNUM){
        return makeOperator.get(operator).calculate.apply(firstNUM, secondNUM);
    }


}
