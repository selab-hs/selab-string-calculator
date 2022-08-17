package validatelogic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidateLengthTest {

    List<String> formula = Arrays.asList(
            "10",
            "+",
            "30"
    );

    @Test
    void checkValidate() {
        assertEquals(formula.size()%2,1);
    }
}