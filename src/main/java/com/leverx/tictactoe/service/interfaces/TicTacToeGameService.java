package com.leverx.tictactoe.service.interfaces;

import com.leverx.tictactoe.model.Player;
import com.leverx.tictactoe.model.gameobject.Sign;

public interface TicTacToeGameService {
    void game(Player firstPlayer, Player secondPlayer);
}
