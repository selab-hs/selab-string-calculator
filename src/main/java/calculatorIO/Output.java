package calculatorIO;

import calculator.Calculator;

public class Output {
    public Output(Calculator calculator){
        printOutputMessage();
        System.out.println(calculator.getResult());
    }

    public void printOutputMessage(){
        System.out.print("\n계산 결과 : ");
    }
}
