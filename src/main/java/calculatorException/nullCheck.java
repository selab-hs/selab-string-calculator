package calculatorException;

import calculator.Calculator;

public class nullCheck {
    public nullCheck(Calculator calculator){
        if (calculator.number.size() == 0 || calculator.operator.size() == 0){
            System.out.println("계산을 진행할 수 없어 프로그램을 종료합니다");
            System.exit(0);
        }
    }
}
