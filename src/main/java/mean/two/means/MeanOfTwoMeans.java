package mean.two.means;

import java.util.Arrays;

public class MeanOfTwoMeans {
    public double getMean(int[] arrayNumber, Integer nFirstNumbers, Integer nLastNumbers) {
        int[] nFirstNumbersArray = Arrays.copyOfRange(arrayNumber, 0, nFirstNumbers);
        int[] nLastNumbersArray = Arrays.copyOfRange(arrayNumber, arrayNumber.length - nLastNumbers, arrayNumber.length);

        if (nFirstNumbers > 1 && nLastNumbers > 1 && nFirstNumbers <= arrayNumber.length && nLastNumbers <= arrayNumber.length) {
            if (nFirstNumbers != null && nLastNumbers != null) {
                double nFirstElementsMean = Arrays.stream(nFirstNumbersArray).mapToDouble(number -> number).sum() / nFirstNumbersArray.length;
                double nLastElementsMean = Arrays.stream(nLastNumbersArray).mapToDouble(number -> number).sum() / nLastNumbersArray.length;
                return (nFirstElementsMean + nLastElementsMean) / 2;
            }

            if (nFirstNumbers != null) {

                return Arrays.stream(nFirstNumbersArray).mapToDouble(number -> number).sum() / nFirstNumbersArray.length;
            }

            if (nLastNumbers != null) {
                return Arrays.stream(nLastNumbersArray).mapToDouble(number -> number).sum() / nLastNumbersArray.length;
            }
        }


        return -1;


    }


}
