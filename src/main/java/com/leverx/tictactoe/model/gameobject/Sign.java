package com.leverx.tictactoe.model.gameobject;

public enum Sign {
    SIGN_X('x'),
    SIGN_O('o'),
    SIGN_EMPTY('.');

    private final char sign;

    Sign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }
}

