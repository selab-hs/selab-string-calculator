package storage;

import java.util.ArrayList;
import java.util.List;

public class Formula implements FormulaRule{
    private List<String> formula = new ArrayList<>();

    public List<String> getFormula() {
        return formula;
    }

    public void setFormula(List<String> formula) {
        this.formula = formula;
    }
}
