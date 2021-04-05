package com.leverx.tictactoe.command;

import com.leverx.tictactoe.model.Player;

public interface Command {
    void execute(Player player);
}
