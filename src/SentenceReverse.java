import org.apache.commons.lang3.StringUtils;

public class SentenceReverse {

    private SentenceReverse() {
    }

    public static String reverseWordOrder(String sentenceToReverse) {
        if (sentenceToReverse == null) {
            return null;
        }
        if (StringUtils.isBlank(sentenceToReverse)) {
            return "";
        }
        String[] splits = sentenceToReverse.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = splits.length - 1; i >= 0; i--) {
            result.append(splits[i]).append(" ");
        }

        return result.toString().trim();
    }
}
