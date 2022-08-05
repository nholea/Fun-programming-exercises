package mean.two.means;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MeanOfTwoMeansTest {
    @Test
    void mean_of_n_first_numbers_of_the_array(){
        double expectedResult = 2;
        Integer nFirstNumbers = 2;
        int [] arrayNumber = new int[] {1,3,2,4};
        MeanOfTwoMeans meanOfTwoMeans = new MeanOfTwoMeans();

        double meanResult = meanOfTwoMeans.getMean(arrayNumber, nFirstNumbers);

        assertThat(meanResult).isEqualTo(expectedResult);}
}
