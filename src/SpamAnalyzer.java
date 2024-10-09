package src;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywordsIn) {
        keywords = keywordsIn;
    }

    @Override
    protected String[] getKeywords(){
        return  null;
    }

    @Override
    protected TextAnalyzer.Label getLabel() {
        return null;
    }
}
