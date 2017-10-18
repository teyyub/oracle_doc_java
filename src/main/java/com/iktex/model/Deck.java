package com.iktex.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author teyyub , Oct 17, 2017 , 7:02:16 PM
 */
public class Deck {

    private final static short CARD_SIZE = 36;
    private final static short NOMBER_OF_CARDS = 6;
    private Card card;
//    private Card[] cards = new Card[CARD_SIZE];
    private Map<Integer, Card> deckOfCard = new HashMap<>();
    private Map<Integer, Card> player1 = new HashMap<>();
    private Map<Integer, Card> player2 = new HashMap<>();

//    private Player player1 = new Player();
//    private Player player2 = new Player();
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

    public void dialCard() {
        int i = 0;
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                deckOfCard.put(i, new Card(r, s));
                i++;
            }
        }
    }

    public void dialToPlayer(Map player) {
//        for (int i = 0; i < 6; i++) {
//            player.put(i, getCardByIndex(i));
//            deckOfCard.remove(i);
//        }
        short counter = 0;
//        for (Integer index : deckOfCard.keySet()) {
////            System.out.println("key " + index);
//            if (counter < 6) {
//                player.put(index, getCardByIndex(index));
//                 deckOfCard.remove(index);
//                 
//            }
//            counter++;
//           
//        }

        for (Map.Entry m : deckOfCard.entrySet()) {
            if (counter < 6) {
                System.out.println(m.getKey());
                player.put(m.getKey(), m.getValue());
                deckOfCard.remove(counter);
                counter++;
            }
        }

    }

    public void printDeck() {
//        System.out.println(cards);
    }

    public int count() {
        return deckOfCard.size();
    }

    public Card getCardByIndex(int index) {
        if (index >= 0 && index < CARD_SIZE) {
            return deckOfCard.get(index);
        }
        return null;

    }

    public Map<Integer, Card> getDeckOfCard() {
        return deckOfCard;
    }

    public void setDeckOfCard(Map<Integer, Card> deckOfCard) {
        this.deckOfCard = deckOfCard;
    }

    public Map<Integer, Card> getPlayer1() {
        return player1;
    }

    public void setPlayer1(Map<Integer, Card> player1) {
        this.player1 = player1;
    }

    public Map<Integer, Card> getPlayer2() {
        return player2;
    }

    public void setPlayer2(Map<Integer, Card> player2) {
        this.player2 = player2;
    }

}
