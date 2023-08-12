package string;

/**
 * @FileName: KMPAlgorithm
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 8/9/2023
 */
public class KMPAlgorithm {
    
    void getNext(int[] next, String s) {
        // 1.初始化
        char[] sChar = s.toCharArray();
        // j:指向前缀末尾位置, 也是最长相等前后缀的长度.
        int j = 0;
        next[0] = 0;
        // i:指向后缀末尾位置
        for (int i = 1; i < s.length(); i++) {
            // 2.处理前后缀不相同的情况
            while (j > 0 && sChar[i] != sChar[j]) {
                j = next[j - 1];
            }
            // 3.处理前后缀相同的情况
            if (sChar[i] == sChar[j]) {
                j++;
            }
            // 4.更新next
            next[i] = j;
        }
    }
}
