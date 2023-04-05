public class LCM {
    public static void main(String[] args) {
        int div = 2, no1 = 4, no2 = 8;
        int max = no1 > no2 ? no1 : no2;
        while (true) {
            if (max % no1 == 0 && max % no2 == 0) {
                System.out.println(max + " ");
                break;
            }
            max = max + 1;
        }
    }
}
