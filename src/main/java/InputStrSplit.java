import java.util.ArrayList;
import java.util.List;

public class InputStrSplit {

    List<String> opsList = new ArrayList<>();
    List<Integer> numList = new ArrayList<>();

    int opsArrListSize = opsList.size();
    int numArrListSize = numList.size();

    String[] opsArr = new String[opsArrListSize];
    int[] numArr = new int[numArrListSize];

    String str = InputStr.input();
    String[] strArr = new String[str.length()];

    public String strSplit() {
        strArr = str.split(" ");
        return "";
    }

    public String opsNumSplit() {

        for(int i = 0; i < strArr.length; i++) {
            switch (strArr[i]) {
                case "+", "-", "*", "/" -> opsList.add(strArr[i]);
                default -> numList.add(Integer.parseInt(strArr[i]));
            }
        }

        opsArr = opsList.toArray(new String[opsArrListSize]);
        numArr = numList.stream().filter(i -> i != null).mapToInt(i -> i).toArray();

        return "";
    }

}
