package find.mean;

import java.util.Arrays;
import java.util.List;

public class FindMean {
    public Integer calculateMean(int [] inputArrayNumbers) {
        return Arrays.stream(inputArrayNumbers).sum() / inputArrayNumbers.length;
    }
}
