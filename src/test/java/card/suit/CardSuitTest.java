package card.suit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CardSuitTest {
    @Test
    void suit_of_card_is_clubs(){
        String inputCard = "3T";
        String expectedSuit = "clubs";
        CardSuit cardsuit = new CardSuit();

        String cardSuit = cardsuit.whatCardSuitIs(inputCard);
        assertThat(cardSuit).isEqualTo(expectedSuit);
    }

    @ParameterizedTest
    @CsvSource(value = {"3♦, diamonds","2♦, diamonds", "4♦, diamonds"})
    void suit_of_card_is_diamonds(String inputCard, String expectedSuit){
        CardSuit cardsuit = new CardSuit();

        String cardSuit = cardsuit.whatCardSuitIs(inputCard);

        assertThat(cardSuit).isEqualTo(expectedSuit);
    }
}
