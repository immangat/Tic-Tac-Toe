package com.mangat.tictactoe.tictactoe;



public class Test {
  public static void main(String[] args) {
    TicTacToe tic = new TicTacToe();

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        tic.setSpecficBox(i, j, 1);
      }
    }
    System.out.println(tic);
  }
}
