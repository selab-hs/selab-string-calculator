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

    public static void checkOperator(String sign) {
        boolean result = Arrays.stream(Operator.values())
                .anyMatch(o -> o.getSign().equals(sign));

        if(!result) {
            throw new RuntimeException("유효하지 않은 연산자입니다!");
        }
    }
}
