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
   * Keeps track of the clicks.
   * If reached 9
   */
  private int clicks;


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


    clicks++;
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
          outputOfCheckMethod = checkPattern1();
          break;
        case 2:
          outputOfCheckMethod = checkPattern2();
          break;
        case 3:
          outputOfCheckMethod = checkPattern3();
          break;
        case 4:
          outputOfCheckMethod = checkPattern4();
          break;
        case 5:
          outputOfCheckMethod = checkPattern5();
          break;
        case 6:
          outputOfCheckMethod = checkPattern6();
          break;
        default:
          outputOfCheckMethod = checkPattern7();
      }
      if(!outputOfCheckMethod.equals("none")){
        winningPatternFound = true;
      }
      whichPattern++;
    }
    if(outputOfCheckMethod.equals("none") && clicks == 9){
      outputOfCheckMethod = "tie";
    }

    return outputOfCheckMethod;
  }

  private String checkPattern7() {
    String output = "none";
    int xCount = 0;
    int oCount = 0;
    for(int i = 0; i < 3; i++){
      Integer temp = playArea[2 - i][i];
      if(temp == null){
        return output;
      }
      if (temp == 0) {
        oCount++;
      } else {
        xCount++;
      }
    }
    if(xCount == 3 || oCount == 3){
      output = xCount == 3 ? "X" : "O";
    }
    return output;
  }

  private String checkPattern6() {
    String output = "none";
    int xCount = 0;
    int oCount = 0;
    for(int i = 0; i < 3; i++){
      Integer temp = playArea[i][i];
      if(temp == null){
        return output;
      }
      if (temp == 0) {
        oCount++;
      } else {
        xCount++;
      }
    }
    if(xCount == 3 || oCount == 3){
      output = xCount == 3 ? "X" : "O";
    }
    return output;
  }

  private String checkPattern5() {
    String output = "none";
    int xCount = 0;
    int oCount = 0;
    for(int i = 0; i < 3; i++){
      Integer temp = playArea[i][2];
      if(temp == null){
        return output;
      }
      if (temp == 0) {
        oCount++;
      } else {
        xCount++;
      }
    }
    if(xCount == 3 || oCount == 3){
      output = xCount == 3 ? "X" : "O";
    }
    return output;
  }

  private String checkPattern4() {
    String output = "none";
    int xCount = 0;
    int oCount = 0;
    for(int i = 0; i < 3; i++){
      Integer temp = playArea[i][1];
      if(temp == null){
        return output;
      }
      if (temp == 0) {
        oCount++;
      } else {
        xCount++;
      }
    }
    if(xCount == 3 || oCount == 3){
      output = xCount == 3 ? "X" : "O";
    }
    return output;
  }

  private String checkPattern3() {
    String output = "none";
    int xCount = 0;
    int oCount = 0;
    for(int i = 0; i < 3; i++){
        Integer temp = playArea[i][0];
        if(temp == null){
          return output;
        }
        if (temp == 0) {
          oCount++;
        } else {
          xCount++;
        }
    }
    if(xCount == 3 || oCount == 3){
      output = xCount == 3 ? "X" : "O";
    }
    return output;
  }

  private String checkPattern2() {
    String output = "none";
    int xCount = 0;
    int oCount = 0;
    for(Integer temp : playArea[2]){
      if(temp == null){
        return output;
      }
      if (temp == 0) {
        oCount++;
      } else {
        xCount++;
      }
    }
    if(xCount == 3 || oCount == 3){
      output = xCount == 3 ? "X" : "O";
    }
    return output;
  }

  private String checkPattern1() {
    String output = "none";
    int xCount = 0;
    int oCount = 0;
    for(Integer temp : playArea[1]){
      if(temp == null){
        return output;
      }
      if (temp == 0) {
        oCount++;
      } else {
        xCount++;
      }
    }
    if(xCount == 3 || oCount == 3){
      output = xCount == 3 ? "X" : "O";
    }
    return output;
  }

  private String checkPattern0() {
    String output = "none";
    int xCount = 0;
    int oCount = 0;
    for(Integer temp : playArea[0]){
      if(temp == null){
        return output;
      }
      if (temp == 0) {
        oCount++;
      } else {
        xCount++;
      }
    }
    if(xCount == 3 || oCount == 3){
      output = xCount == 3 ? "X" : "O";
    }
    return output;
  }


  /**
   * Rests the PlayArea to begin a new Game.
   */
  public void resetPlayState(){
    playArea = new Integer[3][3];
    clicks = 0;
  }
  /***
   * Gives the String representation of the 2D Array.
   * @return String
   */
  public String toString(){
    StringBuilder output = new StringBuilder();
    for (Integer[] ints : playArea) {
      for (int j = 0; j < playArea[0].length; j++) {
        if(ints[j] == null){
          output.append("null");
        } else{
          output.append(ints[j] == 0 ? "O" : "X");
        }
      }
      output.append("\n");
    }
    return output.toString();
  }
}
