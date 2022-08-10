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

    @Test
    void if_the_array_contains_a_single_glove_return_0(){
        String[] inputGloves = new String[] {"red"};
        int expectedNumberPairGloves = 0;
        PairOfGloves pairOfGloves = new PairOfGloves();

        int numberPairGloves = pairOfGloves.getNumberPairGloves(inputGloves);

        assertThat(numberPairGloves).isEqualTo(expectedNumberPairGloves);
    }

    @Test
    void if_the_array_contains_two_gloves_with_the_same_color_return_1(){
        String[] inputGloves = new String[]{"red", "red"};
        int expectedNumberPairGloves = 1;
        PairOfGloves pairOfGloves = new PairOfGloves();

        int numberPairGloves = pairOfGloves.getNumberPairGloves(inputGloves);

        assertThat(numberPairGloves).isEqualTo(expectedNumberPairGloves);
    }
}
