package service.validation;

import java.util.List;


public class LengthValidation {
    public boolean lengthCheckValidate(List<String> formula) {
        return formula.size() % 2 != 0;
    }
}