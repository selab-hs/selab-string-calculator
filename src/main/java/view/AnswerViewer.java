package view;

import dto.AnswerDto;

public class AnswerViewer {
    public void expressResult(AnswerDto answerDto) {
        System.out.println("[ System ] Answer : " + answerDto.getOperationResult());
    }
}