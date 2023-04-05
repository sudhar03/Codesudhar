public class Vowels {
    public static void main(String[] args) {
        String S = "aeiou";
        for (int i = S.length() - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);
            }
            if (S.charAt(i + 1) == '\0') {
                break;
            } else {
                char ch2 = S.charAt(i + 1);
                if (ch2 != 'a' || ch2 != 'e' || ch2 != 'i' || ch2 != 'o' || ch2 != 'u') {
                    System.out.println(ch2);
                }
            }
        }

    }
}
