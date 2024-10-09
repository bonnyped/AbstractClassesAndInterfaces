package src;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    public String[] getKeywords(){
        return new String[] {":(", "=(", ":|"};
    }

    public Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }
}
