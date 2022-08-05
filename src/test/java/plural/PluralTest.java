package plural;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PluralTest {
    @Test
    void if_number_is_zero_returns_false(){
        float inputNumber = 0;
        Plural plural = new Plural();

        boolean needPlural = plural.isOrNotPlural(inputNumber);
        assertThat(needPlural).isTrue();
    }

    @Test
    void if_number_is_one_returns_false(){
        float inputNumber = 1;
        Plural plural = new Plural();

        boolean needPlural = plural.isOrNotPlural(inputNumber);

        assertThat(needPlural).isFalse();
    }

    @ParameterizedTest
    @CsvSource(value = {"2, true","3.4, true","7, true","20, true","55.5, true" })
    void if_number_is_greater_than_one_returns_true(float inputNumber, boolean expectedResult){
        Plural plural = new Plural();

        boolean needPlural = plural.isOrNotPlural(inputNumber);

        assertThat(needPlural).isTrue();
    }


}
