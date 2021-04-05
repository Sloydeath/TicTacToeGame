package com.leverx.tictactoe.validate;

import org.apache.log4j.Logger;

import static com.leverx.tictactoe.starter.TicTacToeGame.gameField;
import static com.leverx.tictactoe.model.gameobject.Sign.SIGN_EMPTY;

public class CellValidator {
    private static final Logger log = Logger.getLogger(CellValidator.class);

    public static boolean isCellValid(String x, String y) {
        if (!x.matches("[1-3]") || !y.matches("[1-3]")) {
            System.out.println("Incorrect data, try again!");
            return false;
        }
        int intX = Integer.parseInt(x) - 1;
        int intY = Integer.parseInt(y) - 1;
        return gameField[intY][intX].getSign().equals(SIGN_EMPTY);
    }
}
