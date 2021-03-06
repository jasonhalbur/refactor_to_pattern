import org.junit.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by jhalbur on 11/28/16.
 */
public class LoanTest {

    @Test
    public void test_loan_returns_loan() {
        Loan loanUT = new Loan(100.00, 800, new Date());
        assertThat(loanUT, is(instanceOf(Loan.class)));
    }
}
