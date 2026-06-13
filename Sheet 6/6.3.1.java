package org.example.finals;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle c = new Circle(100,100,90);
        c.setFill(Color.TRANSPARENT);
        c.setStroke(Color.BLACK);
        Arc a1 = new Arc(100,100,70,70,30,30);
        Arc a2 = new Arc(100,100,70,70,120,30);
        Arc a3 = new Arc(100,100,70,70,210,30);
        Arc a4 = new Arc(100,100,70,70,300,30);
        Circle c1 = new Circle(100,300,90);
        c1.setFill(Color.TRANSPARENT);
        c1.setStroke(Color.BLACK);
        Arc a13 = new Arc(100,300,70,70,30,30);
        Arc a14 = new Arc(100,300,70,70,120,30);
        Arc a15 = new Arc(100,300,70,70,210,30);
        Arc a16 = new Arc(100,300,70,70,300,30);
        Circle c2 = new Circle(300,100,90);
        c2.setFill(Color.TRANSPARENT);
        c2.setStroke(Color.BLACK);
        Arc a5 = new Arc(300,100,70,70,30,30);
        Arc a6 = new Arc(300,100,70,70,120,30);
        Arc a7 = new Arc(300,100,70,70,210,30);
        Arc a8 = new Arc(300,100,70,70,300,30);
        Circle c3 = new Circle(300,300,90);
        c3.setFill(Color.TRANSPARENT);
        c3.setStroke(Color.BLACK);
        Arc a9 = new Arc(300,300,70,70,30,30);
        Arc a10 = new Arc(300,300,70,70,120,30);
        Arc a11 = new Arc(300,300,70,70,210,30);
        Arc a12 = new Arc(300,300,70,70,300,30);
        a1.setType(ArcType.ROUND);
        a2.setType(ArcType.ROUND);
        a3.setType(ArcType.ROUND);
        a4.setType(ArcType.ROUND);
        a5.setType(ArcType.ROUND);
        a6.setType(ArcType.ROUND);
        a7.setType(ArcType.ROUND);
        a8.setType(ArcType.ROUND);
        a9.setType(ArcType.ROUND);
        a10.setType(ArcType.ROUND);
        a11.setType(ArcType.ROUND);
        a12.setType(ArcType.ROUND);
        a13.setType(ArcType.ROUND);
        a14.setType(ArcType.ROUND);
        a15.setType(ArcType.ROUND);
        a16.setType(ArcType.ROUND);

        pane.getChildren().addAll(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,c,c1,c2,c3);
        primaryStage.setScene(new Scene(pane, 500, 300));
        primaryStage.setTitle("Exercise15_25");
        primaryStage.show();
    }
}
