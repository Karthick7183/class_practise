import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String str[] = { "flower", "flow", "flight" };
        int count = 100;
        for (int i = 0; i < str.length; i++) {
            int n = 0;
            for (int j = 1; j < str.length; j++) {
                if (str[0].charAt(i) == str[j].charAt(i)) {
                    n++;
                }
            }
            if (count > n) {
                count = n;
            }
        }
        for (int i = 0; i <= count; i++) {
            System.out.println(str[0].charAt(i));
        }
    }

}
