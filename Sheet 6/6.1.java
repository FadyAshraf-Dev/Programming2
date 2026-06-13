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
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(20));
        TextField tfFirstName = new TextField();
        TextField tfMiddleName = new TextField();
        TextField tfLastName = new TextField();
        tfMiddleName.setPrefColumnCount(2);
        Text txtFirstName = new Text("First Name:");
        Text txtMiddleName = new Text("Middle Name:");
        Text txtLastName = new Text("Last Name:");
        pane.getChildren().addAll(txtFirstName,tfFirstName,txtMiddleName,tfMiddleName,txtLastName,tfLastName);

        primaryStage.setScene(new Scene(pane, 500, 300));
        primaryStage.setTitle("Exercise15_25");
        primaryStage.show();
    }
}
