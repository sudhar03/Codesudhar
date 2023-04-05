public class primefactor {
    public static void main(String[] args) {
        int no = 350, div = 2;
        for (int i = 2; i <= no; i++) {
            while (no % i == 0) {
                System.out.println(i);
                no = no / i;
            }
        }
    }
}