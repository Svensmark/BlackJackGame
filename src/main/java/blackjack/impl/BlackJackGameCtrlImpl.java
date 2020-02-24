/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.impl;

import blackjack.interfaces.BlackJackGameCtrl;
import blackjack.interfaces.BlackJackPlayer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emilt
 */
public class BlackJackGameCtrlImpl implements BlackJackGameCtrl {

    private List<BlackJackPlayer> roundWinners = new ArrayList();

    @Override
    public List<BlackJackPlayer> playRound(List<BlackJackPlayer> players, BlackJackPlayer dealer) {
        for (BlackJackPlayer player : players) {
            roundWinners.add(player);
            playerTurn(player);
        }
        dealerTurn(dealer);
        checkWinners(players, dealer);
        return this.roundWinners;
    }

    @Override
    public void playerTurn(BlackJackPlayer player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void runGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playerWins(BlackJackPlayer player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playerLoses(BlackJackPlayer player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkWinners(List<BlackJackPlayer> players, BlackJackPlayer dealer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dealerTurn(BlackJackPlayer dealer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
