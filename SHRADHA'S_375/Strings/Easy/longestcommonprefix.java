import java.util.Arrays;

public class longestcommonprefix {
    public static String prefix(String[] str) {
        if (str.length == 0 || str == null) {
            return ""; // optimize.........
        }

        Arrays.sort(str);

        String first = str[0];
        String last = str[str.length - 1];

        int i = 0;

        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] str = { "hello", "qwllen", "ashellaan" };
        System.out.println(prefix(str));

    }
}
