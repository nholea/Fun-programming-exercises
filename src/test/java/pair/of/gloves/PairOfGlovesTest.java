package pair.of.gloves;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PairOfGlovesTest {

    @Test
    void if_the_array_is_empty_return_0(){
        String[] inputGloves = new String[] {""};
        int expectedNumberPairGloves = 0;

        PairOfGloves pairOfGloves = new PairOfGloves();
        int numberPairGloves = pairOfGloves.getNumberPairGloves(inputGloves);
        assertThat(numberPairGloves).isEqualTo(expectedNumberPairGloves);

    }
}
