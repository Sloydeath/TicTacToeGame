package com.leverx.tictactoe.command;

import com.leverx.tictactoe.model.Player;
import com.leverx.tictactoe.model.gameobject.Cross;
import com.leverx.tictactoe.model.gameobject.Sign;
import com.leverx.tictactoe.model.gameobject.Zero;
import org.apache.log4j.Logger;

import java.util.Random;

import static com.leverx.tictactoe.starter.TicTacToeGame.gameField;

public class TurnAICommand implements Command {

    private static final Logger log = Logger.getLogger(TurnAICommand.class);
    private final Random random = new Random();

    @Override
    public void execute(Player player) {

        int x;
        int y;

        System.out.println("The turn of the bot:");
        x = random.nextInt(3);
        y = random.nextInt(3);

        if (player.getSign().equals(Sign.SIGN_X)) {
            gameField[y][x] = new Cross(x, y);
        }
        else {
            gameField[y][x] = new Zero(x, y);
        }

        log.info("Coordinates of cell is [" + x + " " + y + "] with sign " + player.getSign() + " of the AI");
    }
}
