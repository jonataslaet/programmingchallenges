package jonataslaet.mycodeschool;

import com.github.jonataslaet.mycodeschool.Exponentiation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentiationTests {

    @ParameterizedTest
    @ValueSource(ints = {99991, 99992, 99993, 99994, 99995})
    public void testXpoweredToN(int i) {
        BigDecimal mostExpectedValue = new BigDecimal(
        "91644491386886988827654548048229124002644802943847387586734772466414594455266242078187667794267166012170387" +
            "11403610179074212421308257220967424034564494521648927516510349424004903688580861581249630073315511510927909" +
            "65429919115202650348194959439077310463"
        );
        for (int j = 0; j < i; j++) {
            assertEquals(mostExpectedValue, Exponentiation.pow(Integer.MAX_VALUE, 27));
        }
    }
}
