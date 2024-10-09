package src;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywordsIn) {
        keywords = keywordsIn;
    }

    @Override
    protected String[] getKeywords(){
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
