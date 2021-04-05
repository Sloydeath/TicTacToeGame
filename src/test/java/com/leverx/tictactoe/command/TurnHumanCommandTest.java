package com.leverx.tictactoe.command;

import com.leverx.tictactoe.model.gameobject.Cross;
import com.leverx.tictactoe.model.gameobject.EmptyCell;
import com.leverx.tictactoe.model.gameobject.GameObject;
import com.leverx.tictactoe.model.gameobject.Zero;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnHumanCommandTest {

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
    public void shouldExecuteHumanTurn() {
        //given
        GameObject zero = new Zero(2, 0);
        gameField[0][0] = zero;
        assertEquals(gameField[0][0], zero);
        assertNotEquals(gameField[0][0], gameField[2][0]);
    }
}