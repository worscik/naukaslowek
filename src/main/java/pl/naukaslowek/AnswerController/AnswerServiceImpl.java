package pl.naukaslowek.AnswerController;

import org.springframework.stereotype.Component;
import pl.naukaslowek.GameController.GameService;

import java.util.Map;

@Component
public class AnswerServiceImpl implements AnswerService{


    GameService gameService;
    Map<String,String> wordsSetForUser;

    public AnswerServiceImpl(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public boolean checkAnswer(AnswerDao answerDao) {
        return gameService.checkAnswer(answerDao.answerForCheck);
    }



}
