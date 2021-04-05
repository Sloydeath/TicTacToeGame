package com.leverx.tictactoe.model.gameobject;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class EmptyCell extends GameObject {

    public final Sign SIGN = Sign.SIGN_EMPTY;

    public EmptyCell(int x, int y) {
        super(x, y);
    }

    @Override
    public Sign getSign() {
        return SIGN;
    }

    @Override
    public String toString() {
        return String.valueOf(SIGN.getSign());
    }
}
