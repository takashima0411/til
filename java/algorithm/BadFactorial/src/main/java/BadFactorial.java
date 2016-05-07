class BadFactorial {

    /**
     * 引数が1以上の時に計算が終わらない再帰.
     *
     * @param n 0以上の整数
     * @return nの階乗
     */
    static int badFactorial(final int n) {
        if (n == 0) {
            return 1;
        }

        return badFactorial(n + 1) / badFactorial(n - 1);
    }
}
