package Java_Core.Theme_3;

interface TextAnalyzer {
    Label processText(String text);
}

enum Label {
    SPAM,
    NEGATIVE_TEXT,
    TOO_LONG,
    OK
}

abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();
}

class SpamAnalyzer extends KeywordAnalyzer {

    @Override
    protected String[] getKeywords() {
        String[] words = {"Работа", "Курьер", "Зарабатывайте", "Заработок", "ЗАРАБОТОК 18+",
                "Детское порно", "ДЕТСКОЕ ПОРНО", "ЦП", "Водитель", "Легкий заработок"};
        //Брал самое популярное, понимаю, что все это обрабатывается иначе.
        return words;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {
        String lowerCase = text.toLowerCase();
        for (String word : getKeywords()) {
            if (lowerCase.contains(word.toLowerCase())) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}

class NegativeTextAnalyzer extends KeywordAnalyzer {
    @Override
    protected String[] getKeywords() {
        String[] symbols = {":(", "=(", ":|"};
        return symbols;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        for (String symbol : getKeywords()) {
            if (text.contains(symbol)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}

class TooLongTextAnalyzer extends KeywordAnalyzer {

    @Override
    protected String[] getKeywords() {
        return null;
    }

    @Override
    protected Label getLabel() {
        return Label.TOO_LONG;
    }

    @Override
    public Label processText(String text) {
        int max_symbols = 45;
        if (text.length() >= max_symbols) {
            return getLabel();
        }
        return Label.OK;
    }
}

class Main {
    public static void main(String[] args) {
        TextAnalyzer analyzer = new SpamAnalyzer();
        TextAnalyzer analyzer1 = new NegativeTextAnalyzer();
        TextAnalyzer analyzer2 = new TooLongTextAnalyzer();

        String text = "Работа курьером, заработок от 300000 тысяч в неделю";
        String text1 = ":( =( :|";
        String text2 = "В конце ноября, в оттепель, часов в девять утра";

        System.out.println("SpamAnalyzer: " + analyzer.processText(text));
        System.out.println("NegativeTextAnalyzer: " + analyzer1.processText(text1));
        System.out.println("TooLongTextAnalyzer: " + analyzer2.processText(text2));
    }
}
