package validatelogic.sequence;

import validatelogic.*;

import java.util.List;

public class ValidateSequenceOne implements ValidateSequence{

    ValidateLogic length;
    ValidateLogic place;
    ValidateLogic number;
    ValidateLogic sign;

    ValidateSequenceOne(){
        this.length = new ValidateLength();
        this.number = new ValidateNumber();
        this.place = new ValidatePlace();
        this.sign = new ValidateSign();
    }

    public void order(List<String> formula){
        length.checkValidate(formula);
        place.checkValidate(formula);
        number.checkValidate(formula);
        sign.checkValidate(formula);
    }
}
