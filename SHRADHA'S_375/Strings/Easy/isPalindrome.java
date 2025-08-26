
public class isPalindrome {
    public static boolean isPalindrome(String str) {
        String reverse = "";
        reverse = str.toLowerCase().replaceAll("[^a-z0-9]", "");   //need to learn abt these functions
        int i = 0;
        int j = reverse.length() - 1;

        while (i <= j) {
            if (reverse.charAt(i) != reverse.charAt(j)) {               // while loop seems simple
                return false;
            }

            i++;
            j--;

        }
        return true;

    }

    public static void main(String args[]) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));

    }
}