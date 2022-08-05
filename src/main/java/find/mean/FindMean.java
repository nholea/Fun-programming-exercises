package find.mean;

import java.util.Arrays;
import java.util.List;

public class FindMean {
    public double calculateMean(int [] inputArrayNumbers) {
        return Arrays.stream(inputArrayNumbers).mapToDouble(number -> number).sum() / inputArrayNumbers.length;
    }
}
