package pl.naukaslowek.GameController;

import org.springframework.stereotype.Service;
import pl.naukaslowek.AddWords.AddWordsService;
import pl.naukaslowek.AppUtils.AppUtils;

import java.util.HashMap;
import java.util.Map;

@Service("GameController")
public class GameServiceImpl implements GameService{

    Map<String,String> wordsSetForGame = new HashMap<>();

    AddWordsService addWordsService;

    public GameServiceImpl(AddWordsService addWordsService) {
        this.addWordsService = addWordsService;
    }

    @Override
    public boolean addWords() {
        addWordsService.addWords(wordsSetForGame);
        return true;
    }

    @Override
    public boolean checkAnswer(String answerToCheck) {
        if(wordsSetForGame.containsKey(answerToCheck)) {
            wordsSetForGame.remove(answerToCheck);
            return true;
        }
        return false;
    }


    @Override
    public Map<String, String> listWords() {
        return wordsSetForGame;
    }

    @Override
    public String getRandomWord() {
        return null;
    }

    private int randomNumber(){
        return AppUtils.randomNumber(wordsSetForGame);
    }

}
