public abstract class KeywordAnalyzer implements TextAnalyzer {
    abstract protected String[] getKeywords();

    abstract protected Label getLabel();

    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (int i = 0; i < keywords.length; i++) {
            if (text.indexOf(keywords[i]) != -1) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
