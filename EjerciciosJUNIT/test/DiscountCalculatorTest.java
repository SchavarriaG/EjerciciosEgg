import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountCalculatorTest {

    @Test
    void discount() {
        assertEquals(0, DiscountCalculator.discount(100, 10).compareTo(new BigDecimal(90)));
        assertEquals(0, DiscountCalculator.discount(100, -10).compareTo(new BigDecimal(90)));
        assertEquals(0, DiscountCalculator.discount(-100, 10).compareTo(new BigDecimal(-90)));
        assertEquals(0, DiscountCalculator.discount(6,75).compareTo(new BigDecimal("1.5")));
        assertEquals(0, DiscountCalculator.discount(6.6,75).compareTo(new BigDecimal("1.65")));
        assertEquals(0, DiscountCalculator.discount(10000000, 90).compareTo(new BigDecimal(1000000)));
    }
}