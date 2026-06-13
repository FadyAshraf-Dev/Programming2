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
import org.w3c.dom.css.Rect;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle r = new Rectangle(i * 25, j * 25, 25, 25);
                if ((i + j) % 2 == 1) {
                    r.setFill(Color.WHITE);
                    r.setStroke(Color.WHITE);
                } else {
                    r.setFill(Color.BLACK);
                    r.setStroke(Color.BLACK);

                }
                pane.getChildren().addAll(r);
            }

        }
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Exercise15_25");
        primaryStage.show();
    }
}
