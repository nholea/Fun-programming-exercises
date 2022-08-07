package card.suit;

import java.nio.charset.StandardCharsets;

public class CardSuit {
    public String whatCardSuitIs(String inputString) {
        if (inputString.substring(1,2).contentEquals(" ? "))
            return "clubs";
        if (inputString.substring(1,2).contentEquals(" ? "))
            return "diamonds";
        if (inputString.substring(1,2).contentEquals(" ? "))
            return "hearts";

        return "spades";
    }

}
