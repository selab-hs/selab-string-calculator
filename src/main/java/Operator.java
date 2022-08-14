import java.util.Arrays;

public enum Operator {
    PLUS("+", (a,b)-> a + b),
    MINUS("-", (a,b)-> a - b),
    MULTIPLE("*", (a,b)-> a * b),
    DIVIDE("/", (a,b)-> a / b),
    ;

    private String sign;
    private Operate operate;

    Operator(String sign, Operate operate) {
        this.sign = sign;
        this.operate = operate;
    }

    public String getSign() {
        return sign;
    }

    public Operate getOperate() {
        return operate;
    }

    public static Operator getOperator(String sign) {
        return Arrays.stream(Operator.values())
                .filter(operator -> operator.getSign().equals(sign))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("지원하지 않는 연산자입니다."));
    }

    public static void checkDivision(Double number, String sign) {
        if(sign.equals("/") && number==0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다!");
        }
    }
}
