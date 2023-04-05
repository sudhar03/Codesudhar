import javax.swing.LayoutStyle;

public class GCD {
    public static void main(String[] args) {
        int div = 2, no1 = 20, no2 = 30, last = 0;
        ;
        int small = no1 < no2 ? no1 : no2;
        while (div < small) {
            if ((no1 % div == 0) && (no2 % div == 0)) {
                System.out.println(div + " ");
                last = div;
            }
            div = div + 1;
        }
        System.out.println("the greatest comman divisor is: " + last);
    }
}
