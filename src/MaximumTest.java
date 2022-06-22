class MaximumTest<T extends Number, U extends Number, V extends Number>{
    // determines the largest of three Comparable objects
    Number maximum (T x, U y, V z) {
        Number max = x; // assume x is initially the largest

        if (y.doubleValue() > max.doubleValue()) {
            max = y; // y is the largest so far
        }

        if (z.doubleValue() > max.doubleValue()) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }
}