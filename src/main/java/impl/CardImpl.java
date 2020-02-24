/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import interfaces.Card;

/**
 *
 * @author emilt
 */
public class CardImpl implements Card{
    
    private Suit suit;
    private Color color;
    private int faceValue;    

    
    public CardImpl(Suit suit, Color color, int faceValue) {
        this.suit = suit;
        this.color = color;
        this.faceValue = faceValue;
    }  
    

    @Override
    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public int getFaceValue() {
        return this.faceValue;
    }
    
    
}
