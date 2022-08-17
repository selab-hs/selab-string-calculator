package validatelogic;

import showconsole.*;

public class ConsoleConfig {

    public ShowConsole numberLogic() {
        return number();
    }

    public ShowConsole placeLogic() {
        return place();
    }

    public ShowConsole lengthLogic() {
        return length();
    }

    public ShowConsole signLogic() {
        return sign();
    }

    private ShowConsole number() {
        return new NumberError();
    }

    private ShowConsole place() {
        return new PlaceError();
    }

    private ShowConsole length() {
        return new LengthError();
    }

    private ShowConsole sign() {
        return new SignError();
    }

}
