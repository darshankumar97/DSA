import java.util.Arrays;

class isAnagram {
    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        char[] char1 = s.toCharArray();                               // learn
        char[] char2 = t.toCharArray();
        Arrays.sort(char2);
        Arrays.sort(char1);

        return Arrays.equals(char1, char2);

    }

    public static void main(String[] args) {
        String s = "MADAM";
        String t = "MADAMw";
        System.out.println(isAnagram(s, t));
    }
}