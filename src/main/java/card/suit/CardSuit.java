package card.suit;

import java.nio.charset.StandardCharsets;

public class CardSuit {
    public String whatCardSuitIs(String inputString) {
        if (inputString.substring(1,2) == "T")
            return "clubs";

        return "diamonds";
    }

    public static void main(String[] args){
        String holi = "3T";
        System.out.println(holi.substring(1,2));
    }
}
