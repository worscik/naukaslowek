package pl.naukaslowek.ListWords;

import org.springframework.stereotype.Component;
import pl.naukaslowek.GameController.GameService;

import java.util.Map;

@Component
public class ListWordsServiceServiceImpl implements ListWordsService {

    GameService gameService;

    public ListWordsServiceServiceImpl(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public Map<String, String> list() {
        return gameService.listWords();
    }

}
