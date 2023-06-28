package dto;

import java.util.List;

public class FormulaDto {
    private List<String> formula;

    public FormulaDto(List<String> formula) {
        this.formula = formula;
    }

    public List<String> getFormula() {
        return formula;
    }
}