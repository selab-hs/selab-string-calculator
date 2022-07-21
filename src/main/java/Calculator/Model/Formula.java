package Model;

import java.util.ArrayList;
import java.util.List;

public class Formula {
    static List<String> formula = new ArrayList<>();

    static public void setFormula(List<String> setFormula) {
        formula.addAll(setFormula);
    }

    public static List<String> getFormula() {
        return formula;
    }

    public static int getFormula(int i){
        return Integer.parseInt(formula.get(i));
    }
}

