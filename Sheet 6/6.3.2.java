
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.Arrays;




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
import javafx.scene.control.Label;
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
        c.setStroke(Color.TRANSPARENT);
        Arc a1 = new Arc(100,100,70,70,0,72);
        Arc a2 = new Arc(100,100,70,70,72,36);
        Arc a3 = new Arc(100,100,70,70,108,108);
        Arc a4 = new Arc(100,100,70,70,216,144);
        a1.setFill(Color.RED);
        a2.setFill(Color.BLUE);
        a3.setFill(Color.GREEN);
        a4.setFill(Color.YELLOW);
        a1.setType(ArcType.ROUND);
        a2.setType(ArcType.ROUND);
        a3.setType(ArcType.ROUND);
        a4.setType(ArcType.ROUND);
        Text lbl1 = new Text(135,70,"%20");
        Text lbl2 = new Text(100,70,"%10");
        Text lbl3 = new Text(50,100,"%30");
        Text lbl4 = new Text(100,170,"%40");

        pane.getChildren().addAll(a1,a2,a3,a4,c,lbl1,lbl2,lbl3,lbl4);
        primaryStage.setScene(new Scene(pane, 500, 300));
        primaryStage.setTitle("Exercise15_25");
        primaryStage.show();
    }
}
