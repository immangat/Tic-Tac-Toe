package com.mangat.tictactoe.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Box;

public class HelloController {
  @FXML
  private Label welcomeText;

  @FXML
  private Button button00;



  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
  }

  @FXML
  protected void onNewButtonClick() {
    welcomeText.setText("Welcome to JavaFXNEw Application!");
  }

  @FXML
  protected void changeStateButton00(ActionEvent e){
    button00.setText("0");
  }

  @FXML
  protected void changeStateButton10(ActionEvent e){

  }

  @FXML
  protected void changeStateButton20(ActionEvent e){

  }

  @FXML
  protected void changeStateButton01(ActionEvent e){

  }

  @FXML
  protected void changeStateButton11(ActionEvent e){

  }

  @FXML
  protected void changeStateButton21(ActionEvent e){

  }
  @FXML
  protected void changeStateButton02(ActionEvent e){

  }
  @FXML
  protected void changeStateButton12(ActionEvent e){

  }
  @FXML
  protected void changeStateButton22(ActionEvent e){

  }




}