package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question {

    String question = "test fråga";
    String[] answers = {"1r", "2f", "3f", "4f"};
    String[] shuffledAnswers = new String[4];

    public Question(){

        List<String> answersList = Arrays.asList(answers);
        Collections.shuffle(answersList);

        answersList.toArray(shuffledAnswers);

        for (int i = 0; i < 4; i++) {
            System.out.println(answers[i]);
        }
    }

}
