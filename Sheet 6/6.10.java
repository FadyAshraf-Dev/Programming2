package org.example.finals;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Polygon polygon = new Polygon(
                10,10,
                20,0,
                30,0,
                40,10
        );
        polygon.setFill(Color.BLUE);

        Rectangle r = new Rectangle(0,10,50,10);
        r.setFill(Color.ORANGE);
        Circle c1 = new Circle(15,25, 5, Color.RED);
        Circle c2 = new Circle(35,25,5, Color.RED);
        Group car=  new Group(polygon,r,c1,c2);
        pane.getChildren().addAll(car);
        Line l= new Line(25,85,275,85);
        PathTransition pt = new PathTransition(Duration.seconds(4),l,car);
        pt.setCycleCount(Animation.INDEFINITE);
        pt.play();
        pane.setOnMousePressed(e->pt.pause());
        pane.setOnMouseReleased(e->pt.play());
        Scene scene = new Scene(pane,300,100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise15_25");
        primaryStage.show();
    }
}
