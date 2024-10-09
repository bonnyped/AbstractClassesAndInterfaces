package src;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        Label result = Label.OK;
        for (int i = 0; i < getKeywords().length; i++) {
            if (text.indexOf(getKeywords()[i]) < 0) {
                result = getLabel();
                i = getKeywords().length;
            }
        }
        return result;
    }
}
