package showconsole;

public class NumberErrorNotification implements ResultNotification {
    @Override
    public void expressOnConsole() {
        System.out.println("number error");
    }
}
