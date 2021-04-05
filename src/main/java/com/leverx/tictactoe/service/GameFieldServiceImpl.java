package com.leverx.tictactoe.service;

import com.leverx.tictactoe.starter.TicTacToeGame;
import com.leverx.tictactoe.model.gameobject.EmptyCell;
import com.leverx.tictactoe.model.gameobject.Sign;
import com.leverx.tictactoe.service.interfaces.GameFieldService;
import org.apache.log4j.Logger;

import static com.leverx.tictactoe.starter.TicTacToeGame.FIELD_SIZE;

public class GameFieldServiceImpl implements GameFieldService {

    private static final Logger log = Logger.getLogger(GameFieldServiceImpl.class);

    @Override
    public void initTable() {
        log.info("game field has initialized");
        for (int row = 0; row < FIELD_SIZE; row++) {
            for (int col = 0; col < FIELD_SIZE; col++) {
                TicTacToeGame.gameField[row][col] = new EmptyCell(row, col);
            }
        }
    }

    @Override
    public void printTable() {
        log.info("game field has printed");
        for (int row = 0; row < FIELD_SIZE; row++) {
            for (int col = 0; col < FIELD_SIZE; col++) {
                System.out.print(TicTacToeGame.gameField[row][col] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean isTableFull() {
        log.info("checked whether the game field is full or not");
        for (int row = 0; row < FIELD_SIZE; row++)
            for (int col = 0; col < FIELD_SIZE; col++)
                if (Sign.SIGN_EMPTY.equals(TicTacToeGame.gameField[row][col].getSign()))
                    return false;
        return true;
    }
}
