package sum.two.arrays;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.ArrayUtils;

public class SumTwoArrays {
    public int[] addArrays(int[] inputArrayNumbers1, int[] inputArrayNumbers2) {

        if (inputArrayNumbers1.length != 0 && inputArrayNumbers2.length != 0) {
            String inputArrayNumbers1ToString = Arrays.stream(inputArrayNumbers1)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining());
            String inputArrayNumbers2ToString = Arrays.stream(inputArrayNumbers2)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining());

            int sumStrings = Integer.parseInt(inputArrayNumbers1ToString) + Integer.parseInt(inputArrayNumbers2ToString);

            String[] sumStringToArray = String.valueOf(sumStrings).split("");

            if (sumStringToArray[0].equals("-")) {
                sumStringToArray[1] = "-" + sumStringToArray[1];
                sumStringToArray = ArrayUtils.removeElement(sumStringToArray, "-");
            }

            int[] resultSumTwoArrays = Arrays.stream(sumStringToArray).
                    mapToInt(Integer::parseInt).
                    toArray();

            return resultSumTwoArrays;

        }
        ;

        if (inputArrayNumbers1.length != 0) {
            return inputArrayNumbers1;
        }
        if (inputArrayNumbers2.length != 0) {
            return inputArrayNumbers2;
        }

        return new int[]{};
    }

}
