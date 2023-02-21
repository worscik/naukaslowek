package pl.naukaslowek.AnswerController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerWebController {

    AnswerService answerService;

    public AnswerWebController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping("/checkAnswer")
    public boolean checkAnswer(@RequestBody AnswerDao answerDao){
        return answerService.checkAnswer(answerDao);
    }

}
