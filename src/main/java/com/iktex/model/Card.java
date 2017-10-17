package com.iktex.model;

/**
 *
 * @author teyyub Oct 4, 2017 12:41:51 PM
 */
public class Card {

    private Rank rank;
    private Suit suit;
//    private String rank;
//    private String suit;
//    
    public Card() {
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    
 
}
