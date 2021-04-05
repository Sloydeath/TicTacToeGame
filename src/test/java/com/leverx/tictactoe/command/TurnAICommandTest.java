package com.leverx.tictactoe.command;

import com.leverx.tictactoe.model.gameobject.Cross;
import com.leverx.tictactoe.model.gameobject.EmptyCell;
import com.leverx.tictactoe.model.gameobject.GameObject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnAICommandTest {

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
    public void shouldExecuteAITurn() {
        //given
        GameObject cross = new Cross(1, 2);
        gameField[1][2] = cross;
        assertEquals(gameField[1][2], cross);
    }
}