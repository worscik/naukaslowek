package pl.naukaslowek.ListWords;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.naukaslowek.GameController.GameService;

import java.util.Map;

@RestController
@CrossOrigin(origins = ("*"))
public class ListWordsWebContorller {


    ListWordsService listWords;

    public ListWordsWebContorller(ListWordsService listWords) {
        this.listWords = listWords;
    }

    @GetMapping("/listWords")
    public Map<String,String> listWords(){
        return listWords.list();
    }
}
