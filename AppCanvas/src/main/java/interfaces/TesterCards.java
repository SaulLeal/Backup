package interfaces;

import java.util.Comparator;

public class TesterCards {
    public static void main(String[] args) {
        StandardDeck myDeck = new StandardDeck();
        myDeck.shuffle();
        myDeck.sort(
                (firstCard, secondCard) ->
                        firstCard.getRank().value() - secondCard.getRank().value()
        );
        myDeck.sort(Comparator.comparing(Card::getRank));
        myDeck.sort(
                (firstCard, secondCard) -> {
                    int compare =
                            firstCard.getRank().value() - secondCard.getRank().value();
                    if (compare != 0)
                        return compare;
                    else
                        return firstCard.getSuit().value() - secondCard.getSuit().value();
                }
        );
        myDeck.sort(
                Comparator
                        .comparing(Card::getRank)
                        .thenComparing(Comparator.comparing(Card::getSuit)));
        myDeck.sort(
                Comparator.comparing(Card::getRank)
                        .reversed()
                        .thenComparing(Comparator.comparing(Card::getSuit)));
    }
}
