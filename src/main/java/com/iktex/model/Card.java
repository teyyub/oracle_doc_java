package com.iktex.model;

/**
 *
 * @author teyyub Oct 4, 2017 12:41:51 PM
 */
public class Card {

    
    private String rank;
    private String suit;
    
    public Card() {
    }

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
 
}
