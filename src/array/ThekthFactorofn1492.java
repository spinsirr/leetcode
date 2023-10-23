package array;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/21/2023-1:30 AM
 */
public class ThekthFactorofn1492 {
    
    public int kthFactor(int n, int k) {
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i <= n / 2 + 1; i++) {
            if (n % i == 0) {
                k--;
                if (k == 0) {
                    return i;
                }
            }
        }
        if (k == 1) {
            return n;
        }
        return -1;
    }
}
