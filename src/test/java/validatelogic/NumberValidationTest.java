package validatelogic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NumberValidationTest {
    List<String> formula1 = Arrays.asList(
            "10",
            "+",
            "30"
    );

    List<String> wrongNumbers = Arrays.asList(
            "02",
            "003",
            "03",
            "0"
    );

    @Test
    public void checkValidate() {

        List<String> extractFormula = new ArrayList<>();

        formula1.stream()
                .filter(n -> n.matches("[0-9]+"))
                .forEach(extractFormula::add);

        for (int i = 0; i < extractFormula.size(); i++) {
            Assertions.assertTrue(Integer.parseInt(extractFormula.get(i)) > 0);
        }
    }

    @Test
    public void notStartZero() {
        wrongNumbers.stream()
                .forEach(NumberValidationTest::notStartZero);

    }

    private static void notStartZero(String number) {
        if (number.charAt(0) == '0' && !number.equals("0")) {
            System.out.println("Error");
        }
    }

}