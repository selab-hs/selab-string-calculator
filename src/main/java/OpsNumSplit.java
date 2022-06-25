import java.util.ArrayList;
import java.util.List;

public class OpsNumSplit {

    List<String> opsList;
    List<Integer> numList;

    public void opsNumSplit(String[] strArr) {

        opsList = new ArrayList<>();
        numList = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                validateNums(strArr[i]);
            }
            else {
                validateOps(strArr[i]);
            }
        }

    }

    public void validateNums(String str) {
        if(str.matches("^[0-9]*$")) {
            numList.add(Integer.parseInt(str));
        }
        else {
            throw new RuntimeException("숫자가 아닙니다.");
        }
    }

    public void validateOps(String str) {
        if(str.matches("[-+*/]")) {
            opsList.add(str);
        }
        else {
            throw new RuntimeException("부호가 아닙니다.");
        }
    }

    public List<String> getOpsList(){
        return opsList;
    }

    public List<Integer> getNumList(){
        return numList;
    }

}
