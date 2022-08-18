package validatelogic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SignValidationTest {

    String validateSign = "+ / * -";

    List<String> testSign  = Arrays.asList(
            "+",
            "-",
            "/",
            "*"
    );

    @Test
    void checkValidate() {
        testSign.stream()
                .forEach(n -> assertTrue(validateSign.contains(n)));
    }
}