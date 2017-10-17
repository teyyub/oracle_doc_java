/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iktex.model;

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
        deck  = new Deck();
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
        
        assertEquals(deck.getCardByIndex(0).getRank() , Rank.SIX);
        assertEquals(deck.getCardByIndex(0).getSuit(), Suit.CLUB);  
        
        assertEquals(deck.getCardByIndex(35).getRank() , Rank.KING);
        assertEquals(deck.getCardByIndex(35).getSuit(), Suit.SPADE);  
        
    }
  
}
