package calculator;

import calculation.Calculate;

public enum Operator_1 implements Calculate {
    PLUS("+"){
        @Override
        public int doCalculate(int number1, int number2){
            return number1 + number2;
        }
    }, MINUS("-"){
        @Override
        public int doCalculate(int number1, int number2){
            return number1 - number2;
        }
    }, TIMES("*"){
        @Override
        public int doCalculate(int number1, int number2){
            return number1 * number2;
        }
    }, DIVISION("/"){
        @Override
        public int doCalculate(int number1, int number2){
            return number1 / number2;
        }
    };

    private String sign;

    Operator_1(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
