package pair.of.gloves;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PairOfGlovesTest {

    @Test
    void if_the_array_is_empty_return_0(){
        String[] inputGloves = new String[] {""};
        String expectedNumberPairGloves = "0 ()";
        PairOfGloves pairOfGloves = new PairOfGloves();

        String numberPairGloves = pairOfGloves.getNumberPairGloves(inputGloves);

        assertThat(numberPairGloves).isEqualTo(expectedNumberPairGloves);

    }

    @Test
    void if_the_array_contains_a_single_glove_return_0(){
        String[] inputGloves = new String[] {"red"};
        String expectedNumberPairGloves = "0 ()";
        PairOfGloves pairOfGloves = new PairOfGloves();

        String numberPairGloves = pairOfGloves.getNumberPairGloves(inputGloves);

        assertThat(numberPairGloves).isEqualTo(expectedNumberPairGloves);
    }

    @Test
    void if_the_array_contains_two_gloves_with_the_same_color_return_1_red_pair(){
        String[] inputGloves = new String[]{"red", "red"};
        String expectedNumberPairGloves = "1 (1 red pair)";
        PairOfGloves pairOfGloves = new PairOfGloves();

        String numberPairGloves = pairOfGloves.getNumberPairGloves(inputGloves);

        assertThat(numberPairGloves).isEqualTo(expectedNumberPairGloves);
    }


    @Test
    void if_the_array_contains_five_gloves_with_the_same_color_return_2_red_pairs(){
        String[] inputGloves = new String[]{"red", "red", "red", "red", "red"};
        String expectedNumberPairGloves = "2 (2 red pairs)";
        PairOfGloves pairOfGloves = new PairOfGloves();

        String numberPairGloves = pairOfGloves.getNumberPairGloves(inputGloves);

        assertThat(numberPairGloves).isEqualTo(expectedNumberPairGloves);
    }

    @Test
    void if_the_array_contains_5_blue_gloves_and_one_purple_return_2_blue_pairs(){
        String[] inputGloves = new String[] {"blue", "blue", "blue", "blue", "blue", "purple"};

        String expectedNumberPairGloves = "2 (2 blue pairs)";
        PairOfGloves pairOfGloves = new PairOfGloves();

        String numberPairGloves = pairOfGloves.getNumberPairGloves(inputGloves);
        assertThat(numberPairGloves).isEqualTo(expectedNumberPairGloves);
    }



    @Test
    void if_the_array_contains_3_red_gloves_1_green_glove_2_blue_gloves_and_one_yellow_glove_return_1_red_pairs_and_2_blue_pairs(){
        String[] inputGloves = new String[] {"red", "green", "red", "blue", "blue", "yellow","red"};
        String expectedNumberPairGloves = "2 (1 red pair + 1 blue pair)";
        PairOfGloves pairOfGloves = new PairOfGloves();

        String numberPairGloves = pairOfGloves.getNumberPairGloves(inputGloves);

        assertThat(numberPairGloves).isEqualTo(expectedNumberPairGloves);
    }
}


