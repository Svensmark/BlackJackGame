/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author emilt
 */
public interface Card {
    
//  Values  Suits       Colors:
//  Ace     Clubs       
//  2       Diamonds    Red 
//  3       Hearts      
//  4       Spades
//  5       
//  6     
//  7    
//  8     
//  9   
//  10  
//  Jack    
//  Queen     
//  King     
//  
    
    enum Suit {
        DIAMONDS,
        HEARTS,
        SPADES,
        CLUBS
    }
    
    enum Color {
        RED,
        BLACK
    }
    
    //Returns values of the card
    public Suit getSuit();
    public Color getColor();
    public int getFaceValue();
    
    
    
}
