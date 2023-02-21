package pl.naukaslowek.GameController;

import java.util.Map;

public interface GameService {

    boolean addWords();

    boolean checkAnswer(String answer);

    Map<String,String> listWords();

    String getRandomWord();

}
