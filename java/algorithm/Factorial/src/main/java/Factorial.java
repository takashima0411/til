class Factorial {

    /**
     * 再帰による階乗の計算.
     *
     * @param n 0以上の整数
     * @return nの階乗
     */
    static int factorial(final int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
