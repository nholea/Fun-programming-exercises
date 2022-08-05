package card.suit;

import java.nio.charset.StandardCharsets;

public class CardSuit {
    public String whatCardSuitIs(String inputString) {
        if (inputString == "")
            return "clubs";

        return "diamonds";
    }

    public static void main(String[] args){
        System.out.println();
    }
}
