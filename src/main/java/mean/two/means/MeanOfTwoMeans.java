package mean.two.means;

import java.util.Arrays;

public class MeanOfTwoMeans {
    public double getMean(int[] arrayNumber, Integer nFirstNumbers) {
    int[] nFirstNumbersArray = Arrays.copyOfRange(arrayNumber,0,nFirstNumbers);

    return Arrays.stream(nFirstNumbersArray).mapToDouble(number -> number).sum() / nFirstNumbersArray.length;
    }


}
