package showconsole;

public class AnswerNotification {

    public static AnswerNotification answerNotification = new AnswerNotification();

    private AnswerNotification(){

    }
    public void expressResult(int answer){
        System.out.println("Answer : " +answer);
    }
}
