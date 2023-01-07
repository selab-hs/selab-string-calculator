package dto;

public class AnswerDto {
    private int operationResult;

    public AnswerDto(int operationResult) {
        this.operationResult = operationResult;
    }

    public int getOperationResult() {
        return operationResult;
    }
}