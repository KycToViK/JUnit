import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FortuneCookieTest {

    private static FortuneCookieController goodFactoryController;
    private static FortuneCookieController badFactoryController;

    private static FortuneCookieFactory pos;
    private static FortuneCookieFactory neg;


    public static FortuneCookieFactory create(boolean isPositive) {
        FortuneConfig config = new FortuneConfig(isPositive);
        ArrayList<String> positive = new ArrayList<>();
        positive.add("positive");
        ArrayList<String> negative = new ArrayList<>();
        negative.add("negative");
        return new FortuneCookieFactory(config,
                positive,
                negative
        );
    }

    @BeforeEach
    public void BeforeEach() {
        // ваш код
        pos = create(true);
        neg = create(false);
    }

    @Test
    public void shouldReturnPositiveFortune() {
        // ваш код
        Assertions.assertEquals("positive",pos.bakeFortuneCookie().getFortuneText());

    }

    @Test
    public void shouldReturnNegativeFortune() {
        // ваш код
        Assertions.assertEquals("negative",neg.bakeFortuneCookie().getFortuneText());

    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked(){
        pos.bakeFortuneCookie();
        Assertions.assertEquals(1,pos.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked(){
        pos.bakeFortuneCookie();
        pos.bakeFortuneCookie();
        Assertions.assertEquals(2,pos.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall(){
        neg.bakeFortuneCookie();
        neg.bakeFortuneCookie();
        neg.resetCookiesCreated();
        Assertions.assertEquals(0,neg.getCookiesBaked());
    }
}