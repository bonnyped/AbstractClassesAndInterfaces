package src;

public abstract class KeywordAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract TextAnalyzer.Label getLabel();
}
