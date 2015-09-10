import org.apache.commons.lang3.StringUtils;

public class PalindromeDetector {

    private PalindromeDetector() {
    }

    public static boolean isAPalindrome(String stringToTest) {
        if (StringUtils.isBlank(stringToTest) ) {
            return true;
        }
        String lower = stringToTest.toLowerCase();
        int checkLength = lower.length();

        for (int i = 0; i < checkLength / 2; i++) {
            if (lower.charAt(i) != lower.charAt(checkLength - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
