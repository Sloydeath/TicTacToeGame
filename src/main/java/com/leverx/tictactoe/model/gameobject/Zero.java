package com.leverx.tictactoe.model.gameobject;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class Zero extends GameObject {

    private final Sign SIGN = Sign.SIGN_O;

    public Zero(int x, int y) {
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
