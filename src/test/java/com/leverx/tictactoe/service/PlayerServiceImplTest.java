package com.leverx.tictactoe.service;

import com.leverx.tictactoe.command.Command;
import com.leverx.tictactoe.command.ContainerCommand;
import com.leverx.tictactoe.command.TurnAICommand;
import com.leverx.tictactoe.model.Player;
import com.leverx.tictactoe.model.Role;
import com.leverx.tictactoe.model.gameobject.Sign;
import com.leverx.tictactoe.service.interfaces.PlayerService;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerServiceImplTest {

    private final ContainerCommand containerCommand = new ContainerCommand(new PlayerServiceImpl());

    @Test
    public void shouldGetCommandTurnOfPlayer() {
        //then
        assertNotNull(containerCommand.retrieveCommand(Role.AI));
    }
}