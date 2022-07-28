import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum Operator {
    PLUS("+", (a,b)-> a + b),
    MINUS("-", (a,b)-> a - b),
    MULTIPLE("*", (a,b)-> a * b),
    DIVIDE("/", (a,b)-> a / b),
    ;

    private final String sign;
    private final Operate operate;

    public static boolean checkOperator(String sign) {
        return Arrays.stream(Operator.values())
                .anyMatch(o -> o.getSign().equals(sign));
    }

    public static Operator getOperator(String sign) {
        return Arrays.stream(Operator.values())
                .filter(operator -> operator.getSign().equals(sign))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("지원하지 않는 연산자입니다."));
    }
}
