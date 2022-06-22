class GenericsExercise {

    public static void main(String[] args) {

        MaximumTest<Integer,Integer,Integer> maxInt = new MaximumTest<>();
        MaximumTest<Double, Double, Double> maxDouble = new MaximumTest<>();

        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, maxInt.maximum(3,4,5));
        System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maxDouble.maximum(6.6, 8.8,7.7));
    }
}


