class BadFactorial {


    static int badFactorial(final int n) {
        if (n == 0) {
            return 1;
        }

        return badFactorial(n + 1) / badFactorial(n - 1);
    }
}
