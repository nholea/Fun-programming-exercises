package pair.of.gloves;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

public class PairOfGloves {
    public String getNumberPairGloves(String[] inputGloves) {

        Map<String, Integer> pairGloves = new HashMap<>();
        int pairGlovesCount = 0;
        List<String> numberPairGloves = new ArrayList<>();
        for (String gloves : inputGloves) {
            if (pairGloves.containsKey(gloves)) {
                pairGloves.put(gloves, pairGloves.get(gloves) + 1);
            } else {
                pairGloves.put(gloves, 1);
            }
        }
        for (String glove : pairGloves.keySet()) {
            if (pairGloves.get(glove) >= 2) {
                pairGlovesCount += pairGloves.get(glove);
                if (pairGloves.get(glove) / 2 > 1) {
                    numberPairGloves.add(pairGloves.get(glove) / 2 + "\s" + glove + " pairs");
                } else {
                    numberPairGloves.add(pairGloves.get(glove) / 2 + "\s" + glove + " pair");
                }
            }
        }

        return pairGlovesCount/ 2+ " ("+String.join(" + ", numberPairGloves)+ ")";
    }

}
