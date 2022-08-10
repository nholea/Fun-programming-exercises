package pair.of.gloves;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class PairOfGloves {
    public int getNumberPairGloves(String[] inputGloves) {

        Map<String, Integer> pairGloves = new HashMap<>();
        for (String gloves: inputGloves){
            if(pairGloves.containsKey(gloves)){
                pairGloves.put(gloves, pairGloves.get(gloves) + 1);
            }else {
                pairGloves.put(gloves,1);
            }
        }
        int pairGlovesCount = pairGloves.values().stream().mapToInt(Integer::intValue).sum();

        return pairGlovesCount /2;
    }

    public static void main(String[] args){
        Map<String, Integer> pairGloves = new HashMap<>();
        pairGloves.put("red",5);

        int pairGlovesCount = pairGloves.values().stream().mapToInt(Integer::intValue).sum();


        System.out.println("pairGlovesCount: " + pairGlovesCount/2);

    }
}
