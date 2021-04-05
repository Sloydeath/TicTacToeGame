package com.leverx.tictactoe.service.interfaces;

import com.leverx.tictactoe.model.gameobject.GameObject;

public interface GameFieldService {
    void initTable();
    void printTable();
    boolean isTableFull();
}
