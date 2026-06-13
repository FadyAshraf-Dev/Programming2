package org.example.finals;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(20));
        pane.setVgap(20);
        pane.setHgap(20);
        TextField tfFirstName = new TextField();
        TextField tfMiddleName = new TextField();
        TextField tfLastName = new TextField();
        tfMiddleName.setPrefColumnCount(2);
        Text txtFirstName = new Text("First Name:");
        Text txtMiddleName = new Text("Middle Name:");
        Text txtLastName = new Text("Last Name:");
        Button btn = new Button("singup");

        pane.add(txtFirstName,0,0);
        pane.add(tfFirstName,1,0);
        pane.add(txtMiddleName,0,1);
        pane.add(tfMiddleName,1,1);
        pane.add(txtLastName,0,2);
        pane.add(tfLastName,1,2);
        pane.add(btn,1,3);
        GridPane.setHalignment(btn, HPos.RIGHT);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Exercise15_25");
        primaryStage.show();
    }
}
