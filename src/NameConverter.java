import java.util.Arrays;

public class NameConverter {
    
    public static void main(String[] args) {
        String s = "654. Maximum Binary Tree\n";
        char[] sArray = s.toCharArray();
        int fast = 0, slow = 0;
        while (fast < sArray.length && slow < sArray.length) {
            if (sArray[fast] != ' ' && sArray[fast] != '.') {
                sArray[slow] = sArray[fast];
                slow++;
            }
            fast++;
        }
        sArray = Arrays.copyOf(sArray, slow);
        StringBuilder sb = new StringBuilder();
        for (char a : sArray) {
            if (a >= 'A' && a <= 'z') {
                sb.append(a);
            }
        }
        for (char b : sArray) {
            if (b >= '0' && b <= '9') {
                sb.append(b);
            }
        }
        System.out.println('\n' + sb.toString() + '\n');
    }
}
