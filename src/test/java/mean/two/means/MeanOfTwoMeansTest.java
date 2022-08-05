package mean.two.means;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MeanOfTwoMeansTest {

    @Test
    void mean_of_n_first_numbers_of_the_array() {
        double expectedResult = 2;
        Integer nFirstNumbers = 2;
        Integer nLastNumbers = null;
        int[] arrayNumber = new int[]{1, 3, 2, 4};
        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();

        double meanResult = meanOfTwoMeans.getMean(arrayNumber, nFirstNumbers, nLastNumbers);

        assertThat(meanResult).isEqualTo(expectedResult);
    }

    @Test
    void mean_of_n_last_numbers_of_the_array() {
        double expectedResult = 3;
        Integer nLastNumbers = 3;
        Integer nFirstNumbers = null;
        int[] arrayNumber = new int[]{1, 3, 2, 4};

        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();

        double meanResult = meanOfTwoMeans.getMean(arrayNumber, nFirstNumbers, nLastNumbers);

        assertThat(meanResult).isEqualTo(expectedResult);
    }

    @Test
    void mean_of_n_first_numbers_mean_and_n_first_numbers_mean(){
        double expectedResult = 2.5;
        Integer nLastNumbers = 3;
        Integer nFirstNumbers = 2;
        int[] arrayNumber = new int[]{1, 3, 2, 4};

        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();

        double meanResult = meanOfTwoMeans.getMean(arrayNumber, nFirstNumbers, nLastNumbers);

        assertThat(meanResult).isEqualTo(expectedResult);
    }

    @Test
    void if_n_first_numbers_and_n_last_numbers_are_less_than_1_and_greater_than_arrays_length_returns_negative1(){
        double expectedResult = -1.;
        Integer nLastNumbers = 4;
        Integer nFirstNumbers = 0;
        int[] arrayNumber = new int[]{1, 3, 2, 4};

        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();

        double meanResult = meanOfTwoMeans.getMean(arrayNumber, nFirstNumbers, nLastNumbers);

        assertThat(meanResult).isEqualTo(expectedResult);
    }
}
