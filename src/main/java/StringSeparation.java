import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class StringSeparation {
    static final String NUMBER_CHECK_VALUE = "[0-9]+";

    StringSeparation(Queue numberSubmit) {
        this.numberSubmit = numberSubmit;
    }

    private Queue<String> numberSubmit;
    Queue<Integer> numbers = new LinkedList<>();
    Queue<String> Spaces = new LinkedList<>();

    public void splitStringInt() {
        while (!numberSubmit.isEmpty()) {
            if (numberSubmit.peek().matches(NUMBER_CHECK_VALUE)) {
                numbers.add(parseInt(numberSubmit.poll()));
            }
            Spaces.add(numberSubmit.poll());
        }
    }
}
