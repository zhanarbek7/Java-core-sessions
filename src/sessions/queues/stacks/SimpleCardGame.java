package sessions.queues.stacks;

import java.util.Stack;

public class SimpleCardGame {
    private Stack<Card> deck;

    private Stack<Card> graveYard;

    public Card getCardFromDeck() {
        return deck.pop();
    }

    public void discard(Card card) {
        graveYard.push(card);
    }

    public Card lookTopCard() {
        return deck.peek();
    }

    public Stack<Card> getDeck() {
        return deck;
    }

    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }

    public Stack<Card> getGraveYard() {
        return graveYard;
    }

    public void setGraveYard(Stack<Card> graveYard) {
        this.graveYard = graveYard;
    }
}
