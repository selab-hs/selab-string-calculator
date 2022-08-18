package showconsole;

public class LengthErrorNotification implements ResultNotification {
    @Override
    public void expressOnConsole() {
        System.out.println("length error");
    }
}
