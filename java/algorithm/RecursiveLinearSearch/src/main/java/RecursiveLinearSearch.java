class RecursiveLinearSearch {

    private final static int NOT_FOUND = -1;

    /**
     * 基本的な線形探索.
     *
     * @param array 探索対象配列
     * @param n     探索対象の要素数
     * @param x     探索対象の値
     * @param i     検証するarrayのインデックス.
     * @return 発見出来た場合、その要素が存在する添字。見つからなければ-1。
     */
    static int recursiveLinearSearch(final int[] array, final int n, final int x, final int i) {
        if (i >= n) {
            return NOT_FOUND;
        }

        if (array[i] == x) {
            return i;
        }

        return recursiveLinearSearch(array, n, x, i + 1);
    }
}
