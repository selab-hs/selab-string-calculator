package validatelogic;

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
        return new NumberErrorNotification();
    }

    private ResultNotification length() {
        return new LengthErrorNotification();
    }

    private ResultNotification sign() {
        return new SignErrorNotification();
    }

}
