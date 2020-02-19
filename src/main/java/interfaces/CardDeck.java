/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import impl.CardDeckImpl;
import impl.CardImpl;
import java.util.List;

/**
 *
 * @author emilt
 */
public interface CardDeck {
    
    public static CardDeckImpl newEmptyDeck() {
        return new CardDeckImpl();
    }
    
    //Returns the deck
    public CardDeckImpl getDeck();
    
    //Fills the deck with 52 cards, one of each kind.
    public void fillDeck();
    
    //Should shuffle the cards in random order
    public void shuffe();
    
    //Returns a card and removes it from the deck
    public CardImpl drawCard();
    
}
