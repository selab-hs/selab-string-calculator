package controller;

import dto.AnswerDto;
import dto.FormulaDto;
import model.CalculateModel;

public class CalculateController {
    private final CalculateModel calculateModel = new CalculateModel();

    protected AnswerDto calculationProcess(FormulaDto formulaDto) {
        int answer = calculateModel.calculateTheWhole(formulaDto);
        return new AnswerDto(answer);
    }
}