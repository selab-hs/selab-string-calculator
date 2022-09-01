package showconsole;

import showconsole.*;

public class ConsoleConfig {

    public ResultNotification numberLogic() {
        return number();
    }

    public ResultNotification lengthLogic() {
        return length();
    }

    public ResultNotification signLogic() {
        return sign();
    }

    private ResultNotification number() {
        return new ErrorNotification("number");
    }

    private ResultNotification length() {
        return new ErrorNotification("length");
    }

    private ResultNotification sign() {
        return new ErrorNotification("sign");
    }

}
