import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translations = this.dictionary.get(word);
        translations.add(translation);

    }

    public ArrayList<String> translate(String word){
        if(!(this.dictionary.containsKey(word))){
            ArrayList<String> emptyList = new ArrayList<>();
            return emptyList;
        }else{
            return this.dictionary.get(word);
        }
    }

    public void remove(String word){
        this.dictionary.remove(word);
    }
}
