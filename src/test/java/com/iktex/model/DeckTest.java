/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iktex.model;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class DeckTest {
    
    Deck deck;    
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        deck = new Deck();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCard method, of class Deck.
     */
    @Test
    public void testDeck() {
        assertEquals(0, deck.count());
        deck.dialCard();
        assertEquals(36, deck.count());
        Card c = new Card(Rank.SIX, Suit.CLUB);
        assertEquals(deck.getCardByIndex(0), c);
//        assertEquals(deck.getCardByIndex(0).getRank() , Rank.SIX);
//        assertEquals(deck.getCardByIndex(0).getSuit(), Suit.CLUB);  

//        assertEquals(deck.getCardByIndex(35)  , new Card(Rank.KING,Suit.SPADE));
//        assertEquals(deck.getCardByIndex(35).getSuit(), Suit.SPADE);  
    }
    
    @Test
    public void testOutOfIndexDeck() {
        deck.dialCard();
        assertEquals(deck.getCardByIndex(-1), null);        
        assertEquals(deck.getCardByIndex(201), null);        
    }
    
    @Test
    public void testPlayer() {
        assertEquals(0, deck.getPlayer1().size());
        deck.dialCard();
        Map<Integer, Card> player1 = new HashMap<>();
        deck.dialToPlayer(player1);
        assertEquals(6, player1.size());
        assertEquals(30, deck.count());
        
        Map<Integer, Card> player2 = new HashMap<>();
        deck.dialToPlayer(player2);
        assertEquals(6, player2.size());
        assertEquals(24, deck.count());
        
    }

    @Test
    public void testRemoveCard() {
        deck.dialCard();
        assertEquals(36, deck.count());
        deck.remoreCardFromDeck(35);
        assertEquals(35, deck.count());
       
        deck.remoreCardFromDeck(0);
        assertEquals(34, deck.count());
        
        
    }
}
