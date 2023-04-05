import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        int no, temp, sum = 0, count = 0;
        String word = "MALAYALAM";
        String word2 = "";
        // Scanner in = new Scanner(System.in);
        // no = in.nextInt();
        // temp = no;

        // while (no != 0) {
        // int r = no % 10;
        // sum = sum * 10 + r;
        // no = no / 10;
        // }
        // System.out.println(sum);

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
            word2 = word2 + word.charAt(i);
        }

        if (word2.equals(word)) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
    }
}
