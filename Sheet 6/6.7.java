package org.example.finals;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        ClockPane pane = new ClockPane();
        Timeline animation = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            pane.setCurrentTime();
        }));
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
        Scene scene = new Scene(pane,200,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Clock");
        primaryStage.show();
    }
}

class ClockPane extends Pane {
    private int second;
    private int minute;
    private int hour;

    ClockPane() {
        setCurrentTime();
    }

    ClockPane(int second, int minute, int hour) {
        setSecond(second);
        setMinute(minute);
        setHour(hour);

    }

    public void setCurrentTime() {
        Calendar time = new GregorianCalendar();
        setSecond(time.get(Calendar.SECOND));
        setMinute(time.get(Calendar.MINUTE));
        setHour(time.get(Calendar.HOUR_OF_DAY));
        paintClock();
    }

    public void paintClock() {
        getChildren().clear();
        double clockRadius = Math.min(getWidth(), getHeight()) * .8 * .5;
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        Circle c = new Circle(centerX, centerY, clockRadius, Color.TRANSPARENT);
        c.setStroke(Color.BLACK);

        for (int i = 0; i < 12; i++) {
            // Calculate the angle for the current hour (360 degrees divided into 12 chunks)
            double angle = i * (2 * Math.PI / 12);

            // Outer point (sitting exactly on the rim of the clock)
            double xOuter = centerX + clockRadius * Math.sin(angle);
            double yOuter = centerY - clockRadius * Math.cos(angle);

            // Inner point (pushed 6 pixels inward toward the center)
            double xInner = centerX + (clockRadius - 6) * Math.sin(angle);
            double yInner = centerY - (clockRadius - 6) * Math.cos(angle);

            Line tick = new Line(xInner, yInner, xOuter, yOuter);
            tick.setStroke(Color.BLACK);
            getChildren().add(tick);
        }
        for (int i = 0; i < 60; i++) {
            // Calculate the angle for the current hour (360 degrees divided into 12 chunks)
            double angle = i * (2 * Math.PI / 60);

            // Outer point (sitting exactly on the rim of the clock)
            double xOuter = centerX + clockRadius * Math.sin(angle);
            double yOuter = centerY - clockRadius * Math.cos(angle);

            // Inner point (pushed 6 pixels inward toward the center)
            double xInner = centerX + (clockRadius - 2) * Math.sin(angle);
            double yInner = centerY - (clockRadius - 2) * Math.cos(angle);

            Line tick = new Line(xInner, yInner, xOuter, yOuter);
            tick.setStroke(Color.BLACK);
            getChildren().add(tick);
        }
        double sLength = clockRadius * .85;
        double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
        Line secondHand = new Line(centerX, centerY, secondX, secondY);
        secondHand.setStroke(Color.BLUE);

        double mLength = clockRadius * .65;
        double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
        Line minuteHand = new Line(centerX, centerY, minuteX, minuteY);
        minuteHand.setStroke(Color.RED);

        double hLength = clockRadius * .5;
        double hourX = centerX + hLength * Math.sin(hour * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos(hour * (2 * Math.PI / 12));
        Line hourHand = new Line(centerX, centerY, hourX, hourY);
        hourHand.setStroke(Color.GREEN);
        getChildren().addAll(c, secondHand, minuteHand, hourHand);


    }

    public void setSecond(int second) {
        this.second = second;
        paintClock();

    }

    public void setHour(int hour) {
        this.hour = hour;
        paintClock();

    }

    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();

    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paintClock();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paintClock();
    }

}