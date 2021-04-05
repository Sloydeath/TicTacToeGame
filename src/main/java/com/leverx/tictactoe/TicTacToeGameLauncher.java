package com.leverx.tictactoe;

import com.leverx.tictactoe.starter.TicTacToeGame;
import org.apache.log4j.Logger;

public class TicTacToeGameLauncher {
    private static final Logger log = Logger.getLogger(TicTacToeGameLauncher.class);

    public static void main(String[] args) {
        log.info("Application has started");
        TicTacToeGame.startGame();
    }
}
