package sum.two.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumTwoArraysTest {

    @Test
    void if_both_arrays_are_empty_return_an_empty_array() {
        int[] inputArrayNumbers1 = new int[]{};
        int[] inputArrayNumbers2 = new int[]{};
        int[] expectedResult = new int[]{};
        SumTwoArrays sumTwoArrays = new SumTwoArrays();

        int[] addArraysResult = sumTwoArrays.addArrays(inputArrayNumbers1, inputArrayNumbers2);

        assertThat(addArraysResult).isEqualTo(expectedResult);
    }

    @Test
    void if_one_array_is_not_empty_return_the_array_is_not_empty() {
        int[] inputArrayNumbers1 = new int[]{3, 2, 9};
        int[] inputArrayNumbers2 = new int[]{};
        int[] expectedResult = new int[]{3, 2, 9};


        SumTwoArrays sumTwoArrays = new SumTwoArrays();
        int[] addArraysResult = sumTwoArrays.addArrays(inputArrayNumbers1, inputArrayNumbers2);
        assertThat(addArraysResult).isEqualTo(expectedResult);
    }

}

