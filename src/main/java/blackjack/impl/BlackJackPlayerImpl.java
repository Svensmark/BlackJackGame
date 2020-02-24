/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.impl;

import blackjack.interfaces.BlackJackPlayer;
import interfaces.Card;
import java.util.List;

/**
 *
 * @author emilt
 */
public class BlackJackPlayerImpl implements BlackJackPlayer {

    //Fixed values (is set once)
    private String name;

    //Fixed but changable values (must have a start value)
    private int total;
    //Variable values (changes every turn)
    private int bet;
    private List<Card> cards;

    public BlackJackPlayerImpl(String name, int total) {
        this.name = name;
        this.total = total;
        this.bet = 0;
        this.cards = null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBet() {
        return this.bet;

    }

    @Override
    public int getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Card> getCards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bet(int betAmount) {
        if (betAmount <= 0) {
            throw new IllegalArgumentException("Bet must be higher than 0");
        } else if (betAmount > this.total ) {
            throw new IllegalArgumentException("Bet must not be higher than total");
        } else {
            this.bet = betAmount;
        }}

    @Override
    public void hit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doubleDown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
