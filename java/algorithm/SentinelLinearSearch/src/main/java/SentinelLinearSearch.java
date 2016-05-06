class SentinelLinearSearch {

    private static final int NOT_FOUND = -1;

    /**
     * 番兵探索.
     *
     * @param array 探索対象配列
     * @param n     探索対象の要素数
     * @param x     探索対象の値
     * @return 発見出来た場合、その要素が存在する添字。見つからなければ-1。
     */
    static int sentinelLinearSearch(final int[] array, final int n, final int x) {
        int last = array[n - 1];
        array[n - 1] = x;

        int i = 0;
        while (array[i] != x) {
            i++;
        }

        array[n - 1] = last;

        if (i < n - 1 || array[n - 1] == x) {
            return i;
        } else {
            return NOT_FOUND;
        }
    }
}
