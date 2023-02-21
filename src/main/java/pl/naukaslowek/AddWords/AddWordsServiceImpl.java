package pl.naukaslowek.AddWords;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AddWordsServiceImpl implements AddWordsService{

    @Override
    public boolean addWords(Map<String,String> wordsSetForGame) {
        return addWordstoTable(wordsSetForGame);
    }

    private boolean addWordstoTable(Map<String,String> wordsSetForGame){
        wordsSetForGame.put("Hello","Czesc");
        wordsSetForGame.put("Avoid","Unikać");
        wordsSetForGame.put("Borrow","Pozyczać");
        wordsSetForGame.put("Hire","Zatrudniac");
        wordsSetForGame.put("Carry","Nosic");
        wordsSetForGame.put("Call","Dzwonić (do)");
        return true;
    }

}
