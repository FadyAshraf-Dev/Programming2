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
        Pane ballPane = new Pane();
        Circle c =new Circle(30,30,30);
        BorderPane pane = new BorderPane();

        ballPane.getChildren().add(c);
        c.setStroke(Color.BLACK);
        c.setFill(Color.TRANSPARENT);

        HBox hBox =new HBox(10);
        Button left = new Button("left");
        Button right = new Button("right");
        Button up = new Button("up");
        Button down = new Button("down");
        up.setOnAction(e->{
            c.setCenterY(c.getCenterY()-10);
        });
        down.setOnAction(e->{
            c.setCenterY(c.getCenterY()+10);
        });
        left.setOnAction(e->{
            c.setCenterX(c.getCenterX()-10);
        });
        right.setOnAction(e->{
            c.setCenterX(c.getCenterX()+10);
        });
        c.setOnMouseDragged(e->{
            c.setCenterY(e.getY());
            c.setCenterX(e.getX());
        });
        hBox.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(hBox,Pos.CENTER);
        hBox.getChildren().addAll(left,right,up,down);
        pane.setCenter(ballPane);pane.setBottom(hBox);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise15_25");
        primaryStage.show();
    }
}
