import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        // ваш код
        Assertions.assertEquals(-1,priceCalculator.calculatePrice(TransportType.BIKE,0));
    }

    @Test
    public void shouldReturn100ForBikeAndDistanceIs10Km() {
        // ваш код
        Assertions.assertEquals(100,priceCalculator.calculatePrice(TransportType.BIKE,10));
    }

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs21Km() {
        // ваш код
        Assertions.assertEquals(-2,priceCalculator.calculatePrice(TransportType.BIKE,21));
    }


    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs0Km() {
        // ваш код
        Assertions.assertEquals(-1,priceCalculator.calculatePrice(TransportType.CAR,0));
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs1001Km() {
        // ваш код
        Assertions.assertEquals(-2,priceCalculator.calculatePrice(TransportType.CAR,1001));
    }

    @Test
    public void shouldReturn700ForCarAndDistanceIs100Km() {
        // ваш код
        Assertions.assertEquals(700,priceCalculator.calculatePrice(TransportType.CAR,100));
    }


    @Test
    public void shouldBeNegativeWhenTruckAndDistanceIs0Km() {
        // ваш код
        Assertions.assertEquals(-1,priceCalculator.calculatePrice(TransportType.TRUCK,0));
    }

    @Test
    public void shouldReturn5000ForTruckAndDistanceIs1000Km() {
        // ваш код
        Assertions.assertEquals(5000,priceCalculator.calculatePrice(TransportType.TRUCK,1000));
    }

    @Test
    public void shouldBeNullWhenDroneAndDistanceIs0Km() {
        // ваш код
        Assertions.assertEquals(null,priceCalculator.calculatePrice(TransportType.DRONE,0));
    }
}
