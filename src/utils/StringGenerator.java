package utils;

import java.util.Random;


/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/21/2023-12:10 PM
 */
public class StringGenerator {
    
    
    public static void main(String[] args) {
        StringGenerator sg = new StringGenerator();
        String str = sg.concatenateStr(1, Integer.MAX_VALUE / 10);
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        sg.kmp(str);
        endTime = System.currentTimeMillis();
        System.out.println("KMP: " + (endTime - startTime) + " ms");
        startTime = System.currentTimeMillis();
        sg.repeat(str);
        endTime = System.currentTimeMillis();
        System.out.println("Concatenate: " + (endTime - startTime) + " ms");
    }
    
    private String generateSubString(int size) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            long result = Math.round(Math.random() * 25 + 65);
            sb.append((char) result);
        }
        return sb.toString();
    }
    
    private String concatenateStr(int times, int size) {
        long length = ((long) times * size);
        if (length > Integer.MAX_VALUE) {
            times = Integer.MAX_VALUE / size - 1;
        }
        StringBuilder sb = new StringBuilder();
        String subStr = generateSubString(size);
        sb.append(subStr.repeat(Math.max(0, times)));
        return sb.toString();
    }
    
    private void kmp(String s) {
        if (s.isEmpty()) {
            return;
        }
        
        int len = s.length();
        
        s = " " + s;
        char[] chars = s.toCharArray();
        int[] next = new int[len + 1];
        
        for (int i = 2, j = 0; i <= len; i++) {
            while (j > 0 && chars[i] != chars[j + 1]) {
                j = next[j];
            }
            if (chars[i] == chars[j + 1]) {
                j++;
            }
            next[i] = j;
        }
    }
    
    private void repeat(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                StringBuilder pattern = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    pattern.append(s, 0, i);
                }
                if (s.contentEquals(pattern)) {
                    return;
                }
            }
        }
    }
}
