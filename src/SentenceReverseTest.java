import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SentenceReverseTest {

    @Test
    public void testWordReverse() {
        assertEquals(null, SentenceReverse.reverseWordOrder(null));
        assertEquals("", SentenceReverse.reverseWordOrder(""));
        assertEquals("dog", SentenceReverse.reverseWordOrder("dog"));
        assertEquals("dog lazy the over jumps fox the", SentenceReverse.reverseWordOrder("The fox jumps over the lazy dog"));
    }
}
