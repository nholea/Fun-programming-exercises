package sum.two.arrays;

public class SumTwoArrays {
    public int[] addArrays(int[] inputArrayNumbers1, int[] inputArrayNumbers2) {

        if (inputArrayNumbers1.length != 0){
            return inputArrayNumbers1;
        }
        if (inputArrayNumbers2.length != 0){
            return inputArrayNumbers2;
        }
        return new int[]{};
    }
}
