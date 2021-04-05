package com.leverx.tictactoe.model.gameobject;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class Cross extends GameObject {

    public final Sign SIGN = Sign.SIGN_X;

    public Cross(int x, int y) {
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
