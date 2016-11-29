import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by jhalbur on 11/28/16.
 */
public class CaptitalStrategyTest {

    @Test
    public void test_loan_returns_loan() {
        CapitalStrategy capitalStrategyUT = new CapitalStrategy();
        assertThat(capitalStrategyUT, is(instanceOf(CapitalStrategy.class)));
    }
}
