package find.mean;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindMeanTest {

    @Test
    void sum_all_numbers_contains_array(){
        Integer expectedResult = 78;
        int [] inputArrayNumbers = new int[] { 1, 2, 5, 7, 9 , 54};
        FindMean findMean = new FindMean();

        Integer meanResult = findMean.calculateMean(inputArrayNumbers);
        assertThat(meanResult).isEqualTo(expectedResult);

    }

    @Test
    void get_mean_of_array_numbers(){

    }
}
