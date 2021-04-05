package com.leverx.tictactoe.service;

import com.leverx.tictactoe.command.ContainerCommand;
import com.leverx.tictactoe.model.Player;
import com.leverx.tictactoe.model.Role;
import com.leverx.tictactoe.service.interfaces.PlayerService;
import org.apache.log4j.Logger;

public class PlayerServiceImpl implements PlayerService {

    private static final Logger log = Logger.getLogger(PlayerServiceImpl.class);
    private final ContainerCommand commandContainer;

    public PlayerServiceImpl() {
        this.commandContainer = new ContainerCommand(this);
    }

    @Override
    public void turnOfPlayer(Player player) {
        if (player.getRole().equals(Role.HUMAN)) {
            log.info("Turn of HUMAN has executed");
            commandContainer.retrieveCommand(Role.HUMAN).execute(player);
        }
        else if (player.getRole().equals(Role.AI)) {
            log.info("Turn of AI has executed");
            commandContainer.retrieveCommand(Role.AI).execute(player);
        }
    }
}
