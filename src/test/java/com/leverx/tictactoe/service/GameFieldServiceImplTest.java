package com.leverx.tictactoe.service;

import com.leverx.tictactoe.model.gameobject.EmptyCell;
import com.leverx.tictactoe.model.gameobject.GameObject;
import com.leverx.tictactoe.service.interfaces.GameFieldService;
import com.leverx.tictactoe.starter.TicTacToeGame;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class GameFieldServiceImplTest {

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
    public void shouldInitTable() {

        //then
        for (int i = 1; i < gameField.length; i++) {
            assertArrayEquals(gameField[i], gameField[i - 1]);
        }
    }
}