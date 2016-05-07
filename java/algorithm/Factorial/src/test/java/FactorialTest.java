import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void 引数が0の時1を返す() {
        int result = Factorial.factorial(0);

        assertThat(result, is(1));
    }

    @Test
    public void 引数が2の時2を返す() {
        int result = Factorial.factorial(2);

        assertThat(result, is(2));
    }

    @Test
    public void 引数が3の時6を返す() {
        int result = Factorial.factorial(3);

        assertThat(result, is(6));
    }
}
