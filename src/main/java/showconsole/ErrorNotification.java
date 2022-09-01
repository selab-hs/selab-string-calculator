package showconsole;

public class ErrorNotification implements ResultNotification{

    String errorAlert;

    public ErrorNotification(String errorAlert){
        this.errorAlert = errorAlert;
    }
    @Override
    public void expressOnConsole() {
        System.out.println(this.errorAlert+ " error");
    }
}
