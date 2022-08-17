package validatelogic.sequence;

public class ValidateConfig {

    public ValidateSequence validateSequence(){
        return sequence();
    }

    private ValidateSequence sequence(){
        return new ValidateSequenceOne();
    }
}
