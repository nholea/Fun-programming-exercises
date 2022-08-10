package pair.of.gloves;

public class PairOfGloves {
    public int getNumberPairGloves(String[] inputGloves) {

        if(inputGloves.length ==2 && inputGloves[0].equals(inputGloves[1])){
            return 1;
        }
        return 0;
    }
}
