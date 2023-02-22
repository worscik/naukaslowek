package pl.naukaslowek.AnswerController;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerDao {

    @JsonProperty("userAnswer")
    String answerForCheck;

    public String getAnswerForCheck() {
        return answerForCheck;
    }

    @Override
    public String toString() {
        return "AnswerDao{" +
                "answerForCheck='" + answerForCheck + '\'' +
                '}';
    }

}
