package showconsole;

public class ErrorTypeClassification {

    public static ErrorTypeClassification errorTypeClassification = new ErrorTypeClassification();

    private ErrorTypeClassification(){

    }

    public ResultNotification numberLogic() {
        return new ErrorNotification("number");
    }

    public ResultNotification lengthLogic() {
        return new ErrorNotification("length");
    }

    public ResultNotification signLogic() {
        return new ErrorNotification("sign");
    }
}
