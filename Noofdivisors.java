public class Noofdivisors {
    public static void main(String[] args) {
        int div = 2, no = 98, count = 0;
        while (div <= no / 2) {
            if (no % div == 0) {
                // System.out.println(div + " ");
                count = count + 1;
            }
            div = div + 1;
        }
        if (count == 0) {
            System.out.println("it is prime");
        } else {
            System.out.println("it is not a prime");
        }
    }
}
