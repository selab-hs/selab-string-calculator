import java.util.LinkedList;
import java.util.Queue;

public class NumberExtractor extends StringReader {
    Queue<String> numberSubmit = new LinkedList<>();

    public void stringToInteger() {
        String NumSignNum[] = data.split(" ");


        for (String i : NumSignNum) {
            numberSubmit.add(i);
        }

    }
}

