package org.example.finals;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Rectangle r =new Rectangle(30,30,100,100);
        r.setFill(Color.ORANGE);
        pane.getChildren().addAll(r);
        r.setOnMouseDragged(e->{
            r.setY(e.getY()-50);
            r.setX(e.getX()-50);
        });
        Scene scene = new Scene(pane,250,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise15_25");
        primaryStage.show();
    }
}
