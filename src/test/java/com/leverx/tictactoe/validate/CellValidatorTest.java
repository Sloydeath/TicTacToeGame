package com.leverx.tictactoe.validate;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellValidatorTest {

    @Test
    public void shouldCheckIsCellValid() {
        //given
        String x = "4";
        String y = "1";

        //then
        assertTrue(y.matches("[1-3]"));
        assertFalse(x.matches("[1-3]"));
    }
}