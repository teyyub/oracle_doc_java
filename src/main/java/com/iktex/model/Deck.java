package com.iktex.model;

/**
 *
 * @author teyyub , Oct 17, 2017 , 7:02:16 PM
 */
public class Deck {
    private final static short CARD_SIZE =36;
    private Card card;
    private Card[] cards = new Card[CARD_SIZE];

    public Deck(Card card) {
        this.card = card;
    }

    public Deck() {
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    
    public void dialCard(){
        int i=0;
        for(Suit s:Suit.values())
            for (Rank r :Rank.values()){
                cards[i] = new Card(r,s);
                i++;
            }
    }
    
    public void printDeck(){
        System.out.println(cards);
    }
    
}
