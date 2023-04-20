package com.mangat.tictactoe.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

import javax.accessibility.AccessibleIcon;
import javax.swing.*;
import java.util.Optional;

public class HelloController {
  @FXML
  private Label welcomeText;


  @FXML
  private Button quitButton;

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
    checkWhoWon(e);

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
    checkWhoWon(e);

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
    checkWhoWon(e);

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
    checkWhoWon(e);

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
    checkWhoWon(e);

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
    checkWhoWon(e);

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
    checkWhoWon(e);

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
    checkWhoWon(e);

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
    checkWhoWon(e);

  }

  @FXML
  protected void checkWhoWon(MouseEvent e){
    String whoWon = tic.checkState();
    if(whoWon.equals("X") || whoWon.equals("O")){
      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setTitle("Information Dialog");
      alert.setHeaderText(null);
      alert.setContentText(whoWon + " has Won. Do you Want To continue or reset?");
      ButtonType resetButtonType = new ButtonType("Reset", ButtonBar.ButtonData.LEFT);
      ButtonType quitButtonType = new ButtonType("Quit", ButtonBar.ButtonData.RIGHT);
      alert.getButtonTypes().setAll(resetButtonType, quitButtonType);

      Optional<ButtonType> result = alert.showAndWait();
      if (result.isPresent()) {
        if (result.get() == resetButtonType) {
          resetPlayArea();
        } else if (result.get() == quitButtonType) {
          quitGame(e);
        }
      }

    }
  }

  private void resetPlayArea() {
    tic.resetPlayState();
    Button[] buttons = {button00, button10, button20, button01, button11, button21, button02, button12, button22};
    for (Button button : buttons) {
      button.setText("");
    }
  }

  @FXML
  protected void quitGame(MouseEvent e){
    Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
    stage.close();
  }

  @FXML
  protected void printState(ActionEvent e) {

     System.out.println(tic);
  }


}