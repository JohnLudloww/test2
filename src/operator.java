import java.math.BigDecimal;
import java.math.RoundingMode;

public class operator {
    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(5));

        BigDecimal Fee = BigDecimal.valueOf(20).setScale(2);
        BigDecimal total_people = BigDecimal.valueOf(3);
        BigDecimal charge = Fee.divide(total_people, RoundingMode.CEILING.HALF_UP);
        System.out.println(charge);

        BigDecimal charge2 = Fee.divide(total_people, RoundingMode.CEILING.HALF_DOWN);
        System.out.println(charge2);

        BigDecimal charge3 = Fee.divide(total_people, RoundingMode.CEILING.HALF_EVEN);
        System.out.println(charge3);

    double a = 1.1;
    double b = 1.34;

    BigDecimal one = BigDecimal.valueOf(1.1).setScale(2);
    BigDecimal two = BigDecimal.valueOf(1.34).setScale(2);
    System.out.println(one.subtract(two));

    System.out.println(Math.PI); //3.14
        System.out.println(Math.max(3, 5));
        System.out.println(Math.min(3, 5));
        System.out.println(Math.sqrt(5));

        System.out.println((int)(Math.random() * 100) + 100); // 100 - 200







    }


}
