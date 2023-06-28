package view;

import dto.ErrorContextDto;

public class ErrorViewer {
    public void ErrorAlert(ErrorContextDto errorContextDto) {
        if (errorContextDto != null) {
            System.out.println("[ System ] Error : " + errorContextDto.getError());
        }
    }
}