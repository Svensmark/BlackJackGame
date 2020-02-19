package blackjack.interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilt
 */
public interface BlackJackPlayer {
    
    //Return values of the player
    public String getName();
    public int getBet();
    public int getTotal();
    
    //Returns a list of cards
    public void getCards();
    
    //Places a bet on a round
    public void bet(int betAmount);
    
    //Actions to take
    public void hit();
    public void stay();
    public void doubleDown(); 
    
    
}
