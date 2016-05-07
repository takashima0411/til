import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RecursiveLinearSearchTest {

    @Test
    public void 対象が配列にある場合その添字を返す() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int target = 3;

        int result = RecursiveLinearSearch.recursiveLinearSearch(array, array.length, target, 0);

        assertThat(result, is(3));
    }

    @Test
    public void 対象が配列にない場合マイナス1を返す() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;

        int result = RecursiveLinearSearch.recursiveLinearSearch(array, array.length, target, 0);

        assertThat(result, is(-1));
    }
}
