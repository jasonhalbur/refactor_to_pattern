import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by jhalbur on 11/28/16.
 */
public class CaptitalStrategyTermLoanTest {

    @Test
    public void test_loan_returns_loan() {
        CapitalStrategyTermLoan capitalStrategyTermLoanUT = new CapitalStrategyTermLoan();
        assertThat(capitalStrategyTermLoanUT, is(instanceOf(CapitalStrategy.class)));
    }
}
