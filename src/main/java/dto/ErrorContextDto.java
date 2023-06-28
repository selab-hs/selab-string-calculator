package dto;

public class ErrorContextDto {
    private final String error;

    public ErrorContextDto(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}