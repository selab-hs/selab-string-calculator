package view;

public class ErrorTypeClassification {

    public static ErrorTypeClassification errorTypeClassification = new ErrorTypeClassification();

    private ErrorTypeClassification(){

    }

    public ResultNotification number() {
        return new ErrorNotification("number");
    }

    public ResultNotification length() {
        return new ErrorNotification("length");
    }

    public ResultNotification sign() {
        return new ErrorNotification("sign");
    }
}
