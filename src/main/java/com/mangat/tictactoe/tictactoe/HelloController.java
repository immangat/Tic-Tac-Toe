package com.mangat.tictactoe.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Box;

public class HelloController {
  @FXML
  private Label welcomeText;

  @FXML
  private Button button00;

  @FXML
  private Button button10;

  @FXML
  private Button button20;

  @FXML
  private Button button01;

  @FXML
  private Button button11;

  @FXML
  private Button button21;

  @FXML
  private Button button02;

  @FXML
  private Button button12;

  @FXML
  private Button button22;

  private TicTacToe tic = new TicTacToe();


  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
  }

  @FXML
  protected void onNewButtonClick() {
    welcomeText.setText("Welcome to JavaFXNEw Application!");
  }

  @FXML
  protected void changeStateButton00(MouseEvent e) {
    if (e.getButton() == MouseButton.PRIMARY) {
      button00.setText("0");
      tic.setSpecficBox(0, 0, 0);
    } else if (e.getButton() == MouseButton.SECONDARY) {
      button00.setText("X");
      tic.setSpecficBox(0, 0, 1);
    }

  }

  @FXML
  protected void changeStateButton01(MouseEvent e) {
    if (e.getButton() == MouseButton.PRIMARY) {
      button01.setText("0");
      tic.setSpecficBox(0, 1, 0);
    } else if (e.getButton() == MouseButton.SECONDARY) {
      button01.setText("X");
      tic.setSpecficBox(0, 1, 1);
    }

  }

  @FXML
  protected void changeStateButton02(MouseEvent e) {
    if (e.getButton() == MouseButton.PRIMARY) {
      button02.setText("0");
      tic.setSpecficBox(0, 2, 0);
    } else if (e.getButton() == MouseButton.SECONDARY) {
      button02.setText("X");
      tic.setSpecficBox(0, 2, 1);
    }

  }

  @FXML
  protected void changeStateButton10(MouseEvent e) {
    if (e.getButton() == MouseButton.PRIMARY) {
      button10.setText("0");
      tic.setSpecficBox(1, 0, 0);
    } else if (e.getButton() == MouseButton.SECONDARY) {
      button10.setText("X");
      tic.setSpecficBox(1, 0, 1);
    }

  }

  @FXML
  protected void changeStateButton11(MouseEvent e) {
    if (e.getButton() == MouseButton.PRIMARY) {
      button11.setText("0");
      tic.setSpecficBox(1, 1, 0);
    } else if (e.getButton() == MouseButton.SECONDARY) {
      button11.setText("X");
      tic.setSpecficBox(1, 1, 1);
    }

  }

  @FXML
  protected void changeStateButton12(MouseEvent e) {
    if (e.getButton() == MouseButton.PRIMARY) {
      button12.setText("0");
      tic.setSpecficBox(1, 2, 0);
    } else if (e.getButton() == MouseButton.SECONDARY) {
      button12.setText("X");
      tic.setSpecficBox(1, 2, 1);
    }

  }

  @FXML
  protected void changeStateButton20(MouseEvent e) {
    if (e.getButton() == MouseButton.PRIMARY) {
      button20.setText("0");
      tic.setSpecficBox(2, 0, 0);
    } else if (e.getButton() == MouseButton.SECONDARY) {
      button20.setText("X");
      tic.setSpecficBox(2, 0, 1);
    }

  }

  @FXML
  protected void changeStateButton21(MouseEvent e) {
    if (e.getButton() == MouseButton.PRIMARY) {
      button21.setText("0");
      tic.setSpecficBox(2, 1, 0);
    } else if (e.getButton() == MouseButton.SECONDARY) {
      button21.setText("X");
      tic.setSpecficBox(2, 1, 1);
    }

  }

  @FXML
  protected void changeStateButton22(MouseEvent e) {
    if (e.getButton() == MouseButton.PRIMARY) {
      button22.setText("0");
      tic.setSpecficBox(2, 2, 0);
    } else if (e.getButton() == MouseButton.SECONDARY) {
      button22.setText("X");
      tic.setSpecficBox(2, 2, 1);
    }

  }

  @FXML
  protected void checkWhoWon(ActionEvent e){
    System.out.println(tic.checkState());
  }


  @FXML
  protected void printState(ActionEvent e) {
    System.out.println(tic);
  }


}