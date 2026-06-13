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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
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
        Line xAxis = new Line (20,150,480,150);
        Line yAxis = new Line (250,20,250,280);
        Text txtZero = new Text(250,170,"0");
        Text txtPi = new Text(355,170,"pi");
        Text txtTwoPi = new Text(460,170,"2pi");
        Text txtMinusPi = new Text(105,170,"-pi");
        Text txtMinusTwoPi = new Text(40,170,"-2pi");
        Polyline xArrow = new Polyline(
                450,130,
                480,150,
                450,170

        );
        Polyline yArrow = new Polyline(
                230,50,
                250,20,
                270,50

        );
        Polyline sineCurve = new Polyline();
        Polyline cosineCurve = new Polyline();
        for (double i = 40; i <460; i++) {
            double x = (i-250)*(2*2*Math.PI/420);
            double ySine = 150-(60*Math.sin(x));
            double yCosine = 150-(60*Math.cos(x));
            sineCurve.getPoints().addAll(i, ySine);
            cosineCurve.getPoints().addAll(i, yCosine);
        }
        Circle c = new Circle(7,Color.RED);
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.seconds(4));
        pt.setCycleCount(Animation.INDEFINITE);
        pt.setPath(sineCurve);
        pt.setNode(c);
        pt.play();
        pane.getChildren().addAll(xAxis,yAxis,xArrow,yArrow,txtZero,txtMinusPi,txtMinusTwoPi,txtPi,txtTwoPi,sineCurve,cosineCurve,c);
        primaryStage.setScene(new Scene(pane, 500, 300));
        primaryStage.setTitle("Exercise15_25");
        primaryStage.show();
    }
}
