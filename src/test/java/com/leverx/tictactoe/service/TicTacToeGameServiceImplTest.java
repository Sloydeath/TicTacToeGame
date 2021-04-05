package com.leverx.tictactoe.service;

import com.leverx.tictactoe.model.gameobject.Cross;
import com.leverx.tictactoe.model.gameobject.EmptyCell;
import com.leverx.tictactoe.model.gameobject.GameObject;
import com.leverx.tictactoe.model.gameobject.Sign;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeGameServiceImplTest {

    private int FIELD_SIZE;
    public GameObject[][] gameField;

    @Before
    public void init() {
        //given
        FIELD_SIZE = 3;
        gameField = new GameObject[FIELD_SIZE][FIELD_SIZE];

        //when
        for (int row = 0; row < FIELD_SIZE; row++) {
            for (int col = 0; col < FIELD_SIZE; col++) {
                gameField[row][col] = new EmptyCell(row, col);
            }
        }
    }

    @Test
    public void shouldCheckIsWin() {
        //given
        gameField[0][0] = new Cross(0,0);
        gameField[1][1] = new Cross(1,1);
        gameField[2][2] = new Cross(2,2);

        //then should be equals by diagonal
        assertTrue(gameField[0][0].getSign().equals(Sign.SIGN_X) &&
                gameField[1][1].getSign().equals(Sign.SIGN_X) &&
                gameField[2][2].getSign().equals(Sign.SIGN_X));
    }

}