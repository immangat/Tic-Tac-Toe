package com.mangat.tictactoe.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {

    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
    Parent root = fxmlLoader.load();
    Scene scene = new Scene(root,1000,1000, Color.WHITE);
    stage.setTitle("New Progrm");
    Text text = new Text("Random Text");
    text.setY(50);
    text.setX(50);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}