package com.mangat.tictactoe.tictactoe;



public class Test {
  public static void main(String[] args) {
    TicTacToe tic = new TicTacToe();
    Integer[][] test = new Integer[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println(test[i][j]);
      }
    }
  }
}
