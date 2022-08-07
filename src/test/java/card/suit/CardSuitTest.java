package card.suit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CardSuitTest {
    @Test
    void suit_of_card_is_clubs(){
        String inputCard = "3?";
        String expectedSuit = "clubs";
        CardSuit cardsuit = new CardSuit();

        String cardSuit = cardsuit.whatCardSuitIs(inputCard);
        assertThat(cardSuit).isEqualTo(expectedSuit);
    }

    @Test
    void suit_of_card_is_diamonds(){
        String inputCard = "3? ";
        String expectedSuit = "diamonds";
        CardSuit cardsuit = new CardSuit();

        String cardSuit = cardsuit.whatCardSuitIs(inputCard);
        assertThat(cardSuit).isEqualTo(expectedSuit);
    }
    @Test
    void suit_of_card_is_hearts(){
        String inputCard = "3? ";
        String expectedSuit = "hearts";
        CardSuit cardsuit = new CardSuit();

        String cardSuit = cardsuit.whatCardSuitIs(inputCard);
        assertThat(cardSuit).isEqualTo(expectedSuit);
    }

    @Test
    void suit_of_card_is_spades(){
        String inputCard = "3? ";
        String expectedSuit = "spades";
        CardSuit cardsuit = new CardSuit();

        String cardSuit = cardsuit.whatCardSuitIs(inputCard);
        assertThat(cardSuit).isEqualTo(expectedSuit);
    }
}
