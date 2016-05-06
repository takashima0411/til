import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BetterLinearSearchTest {
    @Test
    public void 対象が配列にある場合その添字を返す() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int target = 3;

        int result = BetterLinearSearch.betterLinearSearch(array, array.length, target);

        assertThat(result, is(3));
    }

    @Test
    public void 対象が配列にない場合マイナス1を返す() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;

        int result = BetterLinearSearch.betterLinearSearch(array, array.length, target);

        assertThat(result, is(-1));
    }
}
