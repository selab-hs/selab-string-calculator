package storage;

import java.util.ArrayList;
import java.util.List;

public class RetentionOfNecessaryDate {
    private List<String> formula = new ArrayList<>();

    public RetentionOfNecessaryDate(List<String> formula){
        this.formula = formula;
    }
    public List<String> getFormula() {
        return formula;
    }

}
