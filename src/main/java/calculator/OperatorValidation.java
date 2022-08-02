package calculator;

import calculation.Calculate;

public enum OperatorValidation implements Calculate {
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

    private final String sign;

    OperatorValidation(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}