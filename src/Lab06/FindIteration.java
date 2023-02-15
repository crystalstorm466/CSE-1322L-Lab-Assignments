package Lab06;

public class FindIteration implements FindFib {

    @Override
    public int calculate_fib(int n) {
       if (n == 1 || n == 2) {
            return 1;
        }
        int temp;
        int previous = 0;
        int fib = 1;
        for (int i = 1; i < n; i++) {
         temp = previous;
         previous = fib;
         fib = temp + previous;
        // previous = temp;

            //  answer =  ((answer - i) + (answer - (i+ 1)));
        }

        return FindFib.super.calculate_fib(fib);
    }


}
