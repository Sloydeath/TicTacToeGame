package com.leverx.tictactoe.model.gameobject;


import lombok.Data;

@Data
public abstract class GameObject {

   private int x;
   private int y;

   public GameObject(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public abstract Sign getSign();
}
