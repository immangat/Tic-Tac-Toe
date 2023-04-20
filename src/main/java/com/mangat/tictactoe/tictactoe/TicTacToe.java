package com.mangat.tictactoe.tictactoe;


/**
 * The Class manages the tictactoe on the screen.
 */
public class TicTacToe {

  /**
   * 2D int array that contains the representation of the tic-tac-toe.
   * 0 being O and 1 being X.
   */
  private Integer[][] playArea;

  /**
   * Constructs the TicTacToe Object
   */
  public TicTacToe(){
    playArea = new Integer[3][3];

  }


  /**
   * Gets the 2D array.
   * @return int[][] which contains the current game.
   */
  public Integer[][] getPlayArea() {
    return playArea;
  }


  /**
   * Sets the PlayArea to certain state.
   * @param playArea the new state of the object
   */
  public void setPlayArea(Integer[][] playArea) {
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

  public String checkState(){
    /*
    While to go through each point the on array
    count the o or 1s on that pattern
    if got to three then get out of the loop and return the one with three
     */
    boolean winningPatternFound = false;
    String outputOfCheckMethod = "none";
    int whichPattern = 0;

    while(!winningPatternFound && whichPattern < 8){
      switch(whichPattern){
        case 0:
          outputOfCheckMethod = checkPattern0();
          break;
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          break;
        default:
      }
      if(!outputOfCheckMethod.equals("none")){
        winningPatternFound = true;
      }
      whichPattern++;
    }


    return outputOfCheckMethod;
  }

  private String checkPattern0() {
    String output = "none";
    int xCount = 0;
    int oCount = 0;
    for(int temp : playArea[0]){
      switch(temp){
        case 0:
          oCount++;
          break;
        case 1:
          xCount++;
          break;
        default:
          return output;
      }
    }
    if(xCount == 3 || oCount == 3){
      output = xCount == 3 ? "X" : "O";
    }

    return output;
  }


  /***
   * Gives the String representation of the 2D Array.
   * @return String
   */
  public String toString(){
    StringBuilder output = new StringBuilder();
    for (Integer[] ints : playArea) {
      for (int j = 0; j < playArea[0].length; j++) {
        output.append(ints[j] == 0 ? "O" : "X");
      }
      output.append("\n");
    }
    return output.toString();
  }
}
