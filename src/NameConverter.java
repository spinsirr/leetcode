import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Arrays;

public class NameConverter {
    
    public static void main(String[] args) {
        String s = "501. Find Mode in Binary Search Tree\n";
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
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = new StringSelection(sb.toString());
        clip.setContents(tText, null);
        System.out.println("已复制到剪贴板");
    }
}
