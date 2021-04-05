package com.leverx.tictactoe.service;

import com.leverx.tictactoe.model.Player;
import com.leverx.tictactoe.model.gameobject.Sign;
import com.leverx.tictactoe.service.interfaces.GameFieldService;
import com.leverx.tictactoe.service.interfaces.PlayerService;
import com.leverx.tictactoe.service.interfaces.TicTacToeGameService;
import org.apache.log4j.Logger;

import java.util.Locale;

import static com.leverx.tictactoe.starter.TicTacToeGame.FIELD_SIZE;
import static com.leverx.tictactoe.starter.TicTacToeGame.gameField;

public class TicTacToeGameServiceImpl implements TicTacToeGameService {

    private static final Logger log = Logger.getLogger(TicTacToeGameServiceImpl.class);
    private final GameFieldService gameFieldService;
    private final PlayerService playerService;

    public TicTacToeGameServiceImpl(GameFieldService gameFieldService, PlayerService playerService) {
        this.gameFieldService = gameFieldService;
        this.playerService = playerService;
    }

    @Override
    public void game(Player firstPlayer, Player secondPlayer) {
        while (true) {
            playerService.turnOfPlayer(firstPlayer);
            gameFieldService.printTable();
            if (checkWin(firstPlayer.getSign())) {
                System.out.println(String.valueOf(firstPlayer.getSign().getSign()).toUpperCase(Locale.ROOT) + " WINS!");
                log.info(String.valueOf(firstPlayer.getSign().getSign()).toUpperCase(Locale.ROOT) + " WINS!");
                break;
            }
            if (gameFieldService.isTableFull()) {
                System.out.println("Sorry, DRAW!");
                log.info("Draw in the game");
                break;
            }

            System.out.println("--------------");

            playerService.turnOfPlayer(secondPlayer);
            gameFieldService.printTable();
            if (checkWin(secondPlayer.getSign())) {
                System.out.println(String.valueOf(secondPlayer.getSign().getSign()).toUpperCase(Locale.ROOT) + " WINS!");
                log.info(String.valueOf(secondPlayer.getSign().getSign()).toUpperCase(Locale.ROOT) + " WINS!");
                break;
            }
            if (gameFieldService.isTableFull()) {
                System.out.println("Sorry, DRAW!");
                log.info("Draw in the game");
                break;
            }
        }
        System.out.println("GAME OVER.");
        log.info("GAME OVER");
        gameFieldService.printTable();
    }

    private boolean checkWin(Sign sign) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            if ((gameField[i][0].getSign().equals(sign)
                    && gameField[i][1].getSign().equals(sign)
                    && gameField[i][2].getSign().equals(sign)) ||
                    (gameField[0][i].getSign().equals(sign)
                            && gameField[1][i].getSign().equals(sign)
                            && gameField[2][i].getSign().equals(sign))) {
                return true;
            }

            if ((gameField[0][0].getSign().equals(sign)
                    && gameField[1][1].getSign().equals(sign)
                    && gameField[2][2].getSign().equals(sign)) ||
                    (gameField[2][0].getSign().equals(sign)
                            && gameField[1][1].getSign().equals(sign)
                            && gameField[0][2].getSign().equals(sign))) {
                return true;
            }
        }
        return false;
    }
}
