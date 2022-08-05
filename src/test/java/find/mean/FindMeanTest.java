package find.mean;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindMeanTest {


    @Test
    void get_mean_of_array_numbers(){
        double expectedResult = 37.375;
        int [] inputArrayNumbers = new int[] { 1, 2, 5, 7, 9 , 54, 125,96};
        FindMean findMean = new FindMean();

        double meanResult = findMean.calculateMean(inputArrayNumbers);

        assertThat(meanResult).isEqualTo(expectedResult);

    }
}
