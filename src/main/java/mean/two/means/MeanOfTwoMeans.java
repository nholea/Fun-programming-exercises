package mean.two.means;

import java.util.Arrays;

public class MeanOfTwoMeans {
    public double getMean(int[] arrayNumber, Integer nFirstNumbers, Integer nLastNumbers) {

        if (nFirstNumbers > 1 && nLastNumbers > 1 && nFirstNumbers <= arrayNumber.length && nLastNumbers <= arrayNumber.length) {
            int[] nFirstNumbersArray = Arrays.copyOfRange(arrayNumber, 0, nFirstNumbers);
            int[] nLastNumbersArray = Arrays.copyOfRange(arrayNumber, arrayNumber.length - nLastNumbers, arrayNumber.length);
            double nFirstElementsMean = Arrays.stream(nFirstNumbersArray).mapToDouble(number -> number).sum() / nFirstNumbersArray.length;
            double nLastElementsMean = Arrays.stream(nLastNumbersArray).mapToDouble(number -> number).sum() / nLastNumbersArray.length;
            return (nFirstElementsMean + nLastElementsMean) / 2;

        }

        return -1;

    }


}
