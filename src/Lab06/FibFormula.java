package Lab06;

public class FibFormula implements FindFib {

    private static final double SQRT_5 = Math.sqrt(5);
    private static final double SQRT_5_DIVIDE_PLUS = (1 + SQRT_5) / 2;
    private static final double SQRT_5_DIVIDE_SUBTRACT = (1 - SQRT_5) / 2;

    @Override
    public int calculate_fib(int n) {
        if ( n <= 0  ) { return 0; }
        double fib = (Math.pow(SQRT_5_DIVIDE_PLUS, n) - Math.pow(SQRT_5_DIVIDE_SUBTRACT, n)) / SQRT_5;


        return FindFib.super.calculate_fib((int) fib);
    }


}
