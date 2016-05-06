class BetterLinearSearch {

    private static final int NOT_FOUND = -1;

    /**
     * 改良型線形探索.
     *
     * @param array 探索対象配列
     * @param n     探索対象の要素数
     * @param x     探索対象の値
     * @return 発見出来た場合、その要素が存在する添字。見つからなければ-1。
     */
    static int betterLinearSearch(final int[] array, final int n, final int x) {
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return NOT_FOUND;
    }
}
