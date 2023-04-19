package com.mangat.tictactoe.tictactoe;



public class TicTacToe {

  /**
   * 2D int array that contains the representation of the tic-tac-toe.
   * 0 being O and 1 being X.
   */
  private int[][] playArea;

  /**
   * Constructs the TicTacToe Object
   */
  public TicTacToe(){

  }


  /**
   * Gets the 2D array.
   * @return int[][] which contains the current game.
   */
  public int[][] getPlayArea() {
    return playArea;
  }


  /**
   * Sets the PlayArea to certain state.
   * @param playArea the new state of the object
   */
  public void setPlayArea(int[][] playArea) {
    this.playArea = playArea;
  }


  /**
   * Sets a specific box in the 2D array to some value.
   * @param x the column
   * @param y the row
   * @param value the value to set to
   */
  public void setSpecficBox(int x, int y, int value){
    playArea[x][y] = value;
  }
}
