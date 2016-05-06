class SentinelLinearSearch {

    private static final int NOT_FOUND = -1;

    static int sentinelLinearSearch(final int[] array, final int n, final int x) {
        int last = array[n - 1];
        array[n - 1] = x;

        int i = 0;
        while (array[i] != x) {
            i++;
        }

        array[n - 1] = last;

        if (i < n - 1 || array[n - 1] == x) {
            return  i;
        } else {
            return NOT_FOUND;
        }
    }
}
