package dynamicprogramming;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 11/3/2023-12:10 AM
 */
public class FibonacciNumber509 {
    
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int[] fibonacci = new int[2];
        fibonacci[1] = 1;
        for (int i = 0; i < n - 1; i++) {
            int temp = fibonacci[1];
            fibonacci[1] = fibonacci[1] + fibonacci[0];
            fibonacci[0] = temp;
        }
        return fibonacci[1];
    }
}
