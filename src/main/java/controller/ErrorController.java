package controller;

import dto.ErrorContextDto;
import dto.FormulaDto;
import service.ValidationCheckService;
import view.ErrorViewer;

public class ErrorController {
    private final ValidationCheckService validationCheckService = new ValidationCheckService();

    protected ErrorContextDto errorSequence(FormulaDto formulaDto) {
        return validationCheckService.validateCheck(formulaDto);
    }
}