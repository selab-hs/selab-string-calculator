package inputlogic;

public class InputConfig {

    public InputLogic inputLogic(){
        return input();
    }

    public InputLogic input(){
        return new InputBufferReader();
    }
}
