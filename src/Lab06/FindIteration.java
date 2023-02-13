package Lab06;

public class FindIteration implements FindFib {

    @Override
    public int calculate_fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int previous = 1;
        int fib = 1;
        for (int i = 0; i <= n; i++) {
         int temp = fib;
         fib = fib + previous;
        // previous = temp;

            //  answer =  ((answer - i) + (answer - (i+ 1)));
        }

        return FindFib.super.calculate_fib(fib);
    }


}
