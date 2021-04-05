package com.leverx.tictactoe.starter;

import com.leverx.tictactoe.model.Player;
import com.leverx.tictactoe.model.Role;
import com.leverx.tictactoe.model.gameobject.GameObject;
import com.leverx.tictactoe.model.gameobject.Sign;
import com.leverx.tictactoe.service.GameFieldServiceImpl;
import com.leverx.tictactoe.service.PlayerServiceImpl;
import com.leverx.tictactoe.service.TicTacToeGameServiceImpl;
import com.leverx.tictactoe.service.interfaces.GameFieldService;
import com.leverx.tictactoe.service.interfaces.TicTacToeGameService;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class TicTacToeGame {

    private static final Logger log = Logger.getLogger(TicTacToeGame.class);

    private static final Scanner SCANNER;
    public static final int FIELD_SIZE;
    public static GameObject[][] gameField;

    private static Player firstPlayer;
    private static Player secondPlayer;

    private static final GameFieldService gameFieldService = new GameFieldServiceImpl();

    private static final TicTacToeGameService ticTacToeGameService = new TicTacToeGameServiceImpl(
            gameFieldService,
            new PlayerServiceImpl()
    );

    static {
        log.info("Initialization of static-block");
        FIELD_SIZE = 3;
        SCANNER = new Scanner(System.in);
    }

    public static void startGame() {

        while (true) {
            log.info("New game has started");
            gameField = new GameObject[FIELD_SIZE][FIELD_SIZE];
            selectGameMode();
            gameFieldService.initTable();

            System.out.println("Start field!");
            gameFieldService.printTable();
            System.out.println("--------------");

            ticTacToeGameService.game(firstPlayer, secondPlayer);
        }
    }

    private static void selectGameMode() {

        while (true) {
            String choice = null;
            System.out.println("Do you want to play with your friend or with bot?\n" +
                    "\t1 - with friend and 'X' will be the first\n" +
                    "\t2 - with friend and 'O' will be the second\n" +
                    "\t3 - with bot and you will be the first\n" +
                    "\t4 - with bot and you will be the second\n" +
                    "\t5 - exit");
            choice = SCANNER.next();

            switch (choice) {
                case "1":
                    firstPlayer = new Player(Sign.SIGN_X, Role.HUMAN);
                    secondPlayer = new Player(Sign.SIGN_O, Role.HUMAN);
                    return;
                case "2":
                    firstPlayer = new Player(Sign.SIGN_O, Role.HUMAN);
                    secondPlayer = new Player(Sign.SIGN_X, Role.HUMAN);
                    return;
                case "3":
                    firstPlayer = new Player(Sign.SIGN_X, Role.HUMAN);
                    secondPlayer = new Player(Sign.SIGN_O, Role.AI);
                    return;
                case "4":
                    firstPlayer = new Player(Sign.SIGN_X, Role.AI);
                    secondPlayer = new Player(Sign.SIGN_O, Role.HUMAN);
                    return;
                case "5":
                    log.info("Application stopped");
                    System.out.println("See you soon");
                    System.exit(0);
                default:
                    System.out.println("You entered incorrect data.\nPlease, try again!");
                    log.info("User entered incorrect data: String choice = " + choice);
            }
        }
    }
}
