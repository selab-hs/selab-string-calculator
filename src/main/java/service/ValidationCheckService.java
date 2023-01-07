package service;

import dto.ErrorContextDto;
import dto.FormulaDto;
import service.validation.LengthValidation;
import service.validation.NumberValidation;
import service.validation.SignValidation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidationCheckService {
    private final LengthValidation lengthValidation = new LengthValidation();
    private final NumberValidation numberValidation = new NumberValidation();
    private final SignValidation signValidation = new SignValidation();

    public ErrorContextDto validateCheck(FormulaDto formula) {
        Map<String, Boolean> validation = new HashMap<>();

        boolean isLengthValidate = lengthValidation.lengthCheckValidate(formula.getFormula());
        boolean isNumberValidate = numberValidation.numberCheckValidate(formula.getFormula());
        boolean isSignValidate = signValidation.signCheckValidate(formula.getFormula());

        validation.put("Length", isLengthValidate);
        validation.put("Number", isNumberValidate);
        validation.put("Sign", isSignValidate);

        return createErrorDto(validation);
    }

    private ErrorContextDto createErrorDto(Map<String, Boolean> validation) {
        String[] error = {"Length", "Number", "Sign"};
        for (int i = 0; i < error.length; i++) {
            if (!validation.get(error[i])) {
                return new ErrorContextDto(error[i]);
            }
            break;
        }
        return null;
    }
}