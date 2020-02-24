/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.interfaces;

import java.util.List;

/**
 *
 * @author emilt
 */
public interface BlackJackGameCtrl {
    
    //Returns a list of winning players, and lets every player in the list play their turn.
    //and the dealer at the end.
    public List<BlackJackPlayer> playRound(List<BlackJackPlayer> players, BlackJackPlayer dealer);
    
    //Lets a player take their turn.
    public void playerTurn(BlackJackPlayer player);
    
    //Checks for winners.
    public void checkWinners(List<BlackJackPlayer> players, BlackJackPlayer dealer);
    
    //Lets the dealer take their turn.
    public void dealerTurn(BlackJackPlayer dealer);
    
    //Player wins a turn - calculates and adds winnings to player.
    public void playerWins(BlackJackPlayer player);
    
    //Player loses a turn - no winnings added.
    public void playerLoses(BlackJackPlayer player);
    
    //Runs playRound in a loop and should make it possible to join/leave inbetween rounds.
    public void runGame();
    
}
