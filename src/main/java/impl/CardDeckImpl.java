/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import static interfaces.Card.Color.BLACK;
import static interfaces.Card.Color.RED;
import static interfaces.Card.Suit.CLUBS;
import static interfaces.Card.Suit.DIAMONDS;
import static interfaces.Card.Suit.HEARTS;
import static interfaces.Card.Suit.SPADES;
import interfaces.CardDeck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author emilt
 */
public class CardDeckImpl implements CardDeck {

    private List<CardImpl> cards = new ArrayList();

    @Override
    public List<CardImpl> getCards() {
        return this.cards;
    }

    @Override
    public void fillDeck() {
        for (int i = 1; i <= 4; ++i) {
            for (int j = 1; j <= 13; ++j) {
                switch(i) {
                    case 1:
                        this.cards.add(new CardImpl(DIAMONDS,RED, j));
                        break;
                    case 2:
                        this.cards.add(new CardImpl(HEARTS,RED, j));
                        break;
                    case 3:
                        this.cards.add(new CardImpl(SPADES,BLACK, j));
                        break;
                    case 4:
                        this.cards.add(new CardImpl(CLUBS,BLACK, j));
                        break;
                }                        
            }
        }
    }

    @Override
    public void shuffe() {
        Collections.shuffle(this.cards);
    }

    @Override
    public CardImpl drawCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
