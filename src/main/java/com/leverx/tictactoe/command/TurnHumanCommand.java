package com.leverx.tictactoe.command;

import com.leverx.tictactoe.model.Player;
import com.leverx.tictactoe.model.gameobject.Cross;
import com.leverx.tictactoe.model.gameobject.Sign;
import com.leverx.tictactoe.model.gameobject.Zero;
import com.leverx.tictactoe.validate.CellValidator;
import org.apache.log4j.Logger;

import java.util.Scanner;

import static com.leverx.tictactoe.starter.TicTacToeGame.gameField;

public class TurnHumanCommand implements Command {

    private static final Logger log = Logger.getLogger(TurnHumanCommand.class);
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void execute(Player player) {
        String x;
        String y;

        do {
            System.out.println("The turn of the player with sign '" + player.getSign().getSign() + "'!\n" +
                    "X - columns\n" +
                    "Y - rows\n" +
                    "Enter X and Y (1..3):");
            x = scanner.next();
            y = scanner.next();
        } while (!CellValidator.isCellValid(x, y));

        int intX = Integer.parseInt(x) - 1;
        int intY = Integer.parseInt(y) - 1;

        if (player.getSign().equals(Sign.SIGN_X)) {
            gameField[intY][intX] = new Cross(intX, intY);
        }
        else {
            gameField[intY][intX] = new Zero(intX, intY);
        }

        log.info("Coordinates of cell is [" + intX + " " + intY + "] with sign " + player.getSign() + " of the Human");
    }
}
