import java.math.BigDecimal;

public class DiscountCalculator {

    public static BigDecimal discount(double price, double percent){
        return BigDecimal.valueOf(price).multiply(
                BigDecimal.valueOf(1).subtract(
                        BigDecimal.valueOf( Math.abs(percent) / 100 )));
    }

}
