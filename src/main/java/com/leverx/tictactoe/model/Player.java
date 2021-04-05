package com.leverx.tictactoe.model;

import com.leverx.tictactoe.model.gameobject.Sign;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private Sign sign;
    private Role role;
}
