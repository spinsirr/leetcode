package greedy;

import java.util.Arrays;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/23/2023-2:27 AM
 */
public class Candy135 {
    
    public int candy(int[] ratings) {
        int size = ratings.length;
        int[] candy = new int[size];
        candy[0] = 1;
        for (int i = 1; i < size; i++) {
            candy[i] = (ratings[i] > ratings[i - 1]) ? candy[i - 1] + 1 : 1;
        }
        for (int i = size - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }
        int result = 0;
        for (int num : candy) {
            result += num;
        }
        return result;
    }
}
