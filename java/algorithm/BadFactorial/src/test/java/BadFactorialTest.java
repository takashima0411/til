import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BadFactorialTest {

    @Test
    public void 引数が0の時1を返す() {
        int result = BadFactorial.badFactorial(0);

        assertThat(result, is(1));
    }

    @Test(expected = StackOverflowError.class)
    public void 引数が1の時StackOverFlowが発生する() {
        BadFactorial.badFactorial(1);
    }
}
