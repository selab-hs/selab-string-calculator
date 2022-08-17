import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class StringToInteger {
    public final String isNumber = "[0-9]+";

    StringToInteger(Queue numberSubmit) {
        this.numberSubmit = numberSubmit;
    }

    Queue<String> numberSubmit;
    Queue<Integer> fillternumber = new LinkedList<>();
    Queue<String> fillterSpace = new LinkedList<>();

    public void splitStringInt() {

        while (!numberSubmit.isEmpty()) {
            if (numberSubmit.peek().matches(isNumber)) {
                fillternumber.add(parseInt(numberSubmit.poll()));
            }
            fillterSpace.add(numberSubmit.poll());
        }
    }
}
