package calculatorException;

import calculator.Calculator;

public class valueCheck {
    public valueCheck(Calculator calculator){
        if ((calculator.number.size() - calculator.operator.size()) != 1){
            System.out.println("잘못된 식을 입력하여 프로르램을 종료합니다");
            System.exit(0);
        }
    }
}
