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

    @Test
    void if_two_arrays_are_not_empty_return_an_array_of_the_sum_of_both_arrays_in_same_format_as_given_arrays(){
        int[] inputArrayNumbers1 = new int[]{4,7,3};
        int[] inputArrayNumbers2 =new int[]{1,2,3};
        int[] expectedResult = new int[]{5,9,6};
        SumTwoArrays sumTwoArrays = new SumTwoArrays();

        int[] addArraysResult = sumTwoArrays.addArrays(inputArrayNumbers1, inputArrayNumbers2);

        assertThat(addArraysResult).isEqualTo(expectedResult);

    }

    @Test
    void if_an_array_contains_a_negative_number_as_first_element_the__number_will_be_considered_as_negative_number(){
        int[] inputArrayNumbers1 = new int[] {-7,2,2,8};
        int[] inputArrayNumbers2 = new int[] {3,2,6,6};
        int[] expectedResult = new int[] {-3,9,6,2};
        SumTwoArrays sumTwoArrays = new SumTwoArrays();

        int[] addArraysResult = sumTwoArrays.addArrays(inputArrayNumbers1, inputArrayNumbers2);

        assertThat(addArraysResult).isEqualTo(expectedResult);

    }
}

