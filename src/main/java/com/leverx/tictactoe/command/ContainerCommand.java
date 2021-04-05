package com.leverx.tictactoe.command;

import com.google.common.collect.ImmutableMap;
import com.leverx.tictactoe.model.Role;
import com.leverx.tictactoe.service.interfaces.PlayerService;
import org.apache.log4j.Logger;

public class ContainerCommand {

    private static final Logger log = Logger.getLogger(ContainerCommand.class);
    private final ImmutableMap<Role, Command> commandMap;

    public ContainerCommand(PlayerService playerService) {
        log.info("Container with existing commands has created");

        commandMap = ImmutableMap.<Role, Command>builder()
                .put(Role.HUMAN, new TurnHumanCommand())
                .put(Role.AI, new TurnAICommand())
                .build();
    }

    public Command retrieveCommand(Role commandIdentifier) {
        log.info("Command has retrieved");
        return commandMap.get(commandIdentifier);
    }

}
