package validatelogic.sequence;

public class ValidationConfig {

    public ValidationSequence validateSequence(){
        return sequence();
    }

    private ValidationSequence sequence(){
        return new ValidationSequenceOne();
    }
}
