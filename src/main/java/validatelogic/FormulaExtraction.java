package validatelogic;

import java.util.ArrayList;
import java.util.List;

public class FormulaExtraction {
    List<String> numbers = new ArrayList<>();
    List<String> signs = new ArrayList<>();

    public void extractFormula(List<String> formula) {
        for (int i = 0; i < formula.size(); i++) {
            if(i%2==0) numbers.add(formula.get(i));
            else signs.add(formula.get(i));
        }
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getSigns() {
        return signs;
    }
}
