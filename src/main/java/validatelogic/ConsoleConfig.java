package validatelogic;

import showconsole.*;

public class ConsoleConfig {

    public ShowConsole numberLogic(){
        return new NumberError();
    }

    public ShowConsole placeLogic(){
        return new PlaceError();
    }

    public ShowConsole lengthLogic(){
        return new LengthError();
    }

    public ShowConsole signLogic(){
        return new SignError();
    }

}
