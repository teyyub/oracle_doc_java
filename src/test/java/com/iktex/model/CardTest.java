package com.iktex.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teyyub Oct 4, 2017
 */
public class CardTest {

    private Card card;
    private final static short CARD_SIZE =13;
   //ranks
    private final String ACE = "Ace";
    private final String JACK = "Jack";
    private final String QUEEEN = "Queen";
    private final String KING = "King";

    //suits
    private final String CLUB = "Club";
    private final String DIAMOND = "Diamond";
    private final String HEART = "Heart";
    private final String SPADE = "Spade";

    public CardTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        card = new Card(ACE,CLUB);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.

        assertEquals(ACE,card.getRank());
        assertEquals(CLUB, card.getSuit());
    }

}
