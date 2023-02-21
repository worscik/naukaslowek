package pl.naukaslowek.CreateGame;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.naukaslowek.GameController.GameService;

@RestController
public class CreateGameWebController {

    GameService gameService;

    public CreateGameWebController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/createGame")
    public boolean createGame(){
        return gameService.addWords();
    }

}
