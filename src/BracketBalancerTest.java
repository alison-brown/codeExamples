import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// Test examples taken from corejavainterviewquestions.com
public class BracketBalancerTest {

    @Test
    public void emptyStringIsBalanced() throws Exception {
        assertTrue(BracketBalancer.isBalanced(""));
    }

    @Test
    public void lotsOfNestedBracketsButBalancedReturnsTrue() throws Exception {
        assertTrue(BracketBalancer.isBalanced("([Hell{} T(h(e[r]e))]boom)"));
    }

    @Test
    public void correctNumberOfClosingBracketsButInWrongOrderReturnsFalse() throws Exception {
        assertFalse(BracketBalancer.isBalanced("(a[b{c)d]e}"));
    }

    @Test
    public void onlyHasClosedBracesReturnsFalse() throws Exception {
        assertFalse(BracketBalancer.isBalanced("}])"));
    }

    @Test
    public void correctBalancingButWithMoreOpeningBracketsReturnsFalse() throws Exception {
        assertFalse(BracketBalancer.isBalanced("({}"));
    }
}
