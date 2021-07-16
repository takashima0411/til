import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {

    @Test
    public void 検索対象が先頭にある場合は0を返す() {
        int[] array = {0,1,2};
        int target = 0;

        int result = LinearSearch.linearSearch(array, target);

        assertEquals(result, 0);
    }

    @Test
    public void 検索対象が末尾にある場合は配列の長さより1小さい数値を返す() {
        int[] array = {0,1,2};
        int target = 2;

        int result = LinearSearch.linearSearch(array, target);

        assertEquals(result, array.length - 1);
    }

    @Test
    public void 検索対象が配列内に含まれている場合その添字を返す() {
        int[] array = {0,1,2};
        int target = 1;

        int result = LinearSearch.linearSearch(array, target);

        assertEquals(result, 1);
    }

    @Test
    public void 対象が配列にない場合マイナス1を返す() {
        int[] array = {0,1,2,3,4,5};
        int target = 6;

        int result = LinearSearch.linearSearch(array, target);

        assertEquals(result, -1);
    }

}
