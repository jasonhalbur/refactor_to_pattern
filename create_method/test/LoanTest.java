import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by jhalbur on 11/28/16.
 */
public class LoanTest {

    @Test
    public void test_loan_returns_loan() {
        Loan loanUT = new Loan();
        assertThat(loanUT, is(instanceOf(Loan.class)));
    }
}
