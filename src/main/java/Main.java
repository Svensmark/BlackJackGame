
import impl.CardDeckImpl;
import interfaces.CardDeck;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilt
 */
public class Main {
    
    
    public static void main(String[] args) {
        CardDeck deck = new CardDeckImpl();
        deck.fillDeck();
        System.out.println(deck.getCards().get(0).getColor() + " " + deck.getCards().get(0).getFaceValue() + " " + deck.getCards().get(0).getSuit());
        System.out.println();
        deck.shuffe();
        System.out.println(deck.getCards().get(0).getColor() + " " + deck.getCards().get(0).getFaceValue() + " " + deck.getCards().get(0).getSuit());
        System.out.println();
        deck.shuffe();
        System.out.println(deck.getCards().get(0).getColor() + " " + deck.getCards().get(0).getFaceValue() + " " + deck.getCards().get(0).getSuit());
        System.out.println();
        deck.shuffe();
        System.out.println(deck.getCards().get(0).getColor() + " " + deck.getCards().get(0).getFaceValue() + " " + deck.getCards().get(0).getSuit());
        System.out.println();

    }
    
}
