import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Operator {
    PLUS("+", (a,b)-> a + b),
    MINUS("-", (a,b)-> a - b),
    MULTIPLE("*", (a,b)-> a * b),
    DIVIDE("/", (a,b)-> a / b), //0으로 나누기 예외처리
    ;

    private final String sign;
    private final Calulable calulable;

    public static boolean of(String sign) {
        for(Operator o : Operator.values()) {
            if(o.getSign().equals(sign)) return true;
        }
        return false;
    }
}
