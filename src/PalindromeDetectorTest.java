import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeDetectorTest {

    @Test
    public void testPalindromes() {
        assertTrue(PalindromeDetector.isAPalindrome(null));
        assertTrue(PalindromeDetector.isAPalindrome(""));
        assertTrue(PalindromeDetector.isAPalindrome("a"));
        assertTrue(PalindromeDetector.isAPalindrome("racecar"));
        assertTrue(PalindromeDetector.isAPalindrome("raceecar"));
        assertFalse(PalindromeDetector.isAPalindrome("wotever"));
        assertFalse(PalindromeDetector.isAPalindrome("almostomls"));
    }
}
