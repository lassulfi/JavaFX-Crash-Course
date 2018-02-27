/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author LuisDaniel
 */
public class ShowShapes extends Application{
    
    @Override
    public void start(Stage primaryStage) {
        
        try {
        
            Pane pane = new Pane();
            pane.setPadding(new Insets(5));
            
            Text text1 = new Text(20, 20, "Programming is Fun!");
            text1.setFont(Font.font("Courier", 
                                    FontWeight.BOLD, 
                                    FontPosture.ITALIC, 
                                    15));
            
            pane.getChildren().add(text1);
            
            Text text2 = new Text(60, 60, "Programming is Fun!\n Display Text");
            pane.getChildren().add(text2);
            
            Text text3 = new Text(10, 100, "Programming is Fun!\n Display Text");
            text3.setFill(Color.RED);
            text3.setUnderline(true);
            text3.setStrikethrough(true);
            pane.getChildren().add(text3);
            
            Scene scene = new Scene(pane);
            primaryStage.setTitle("Show Text");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            Stage stage2 = new Stage();
            Scene scene2 = new Scene(new LinePane(), 200, 200);
            stage2.setTitle("Show line");
            stage2.setScene(scene2);
            stage2.show();
            
            Pane pane2 = new Pane();
            
            Rectangle r1 = new Rectangle(25, 50, 60, 30);
            r1.setStroke(Color.BLACK);
            r1.setFill(Color.WHITE);
            
            pane2.getChildren().add(new Text(10, 27, "R1"));
            pane2.getChildren().add(r1);
            
            Rectangle r2 = new Rectangle(25, 60, 60, 30);
            
            pane2.getChildren().add(new Text(10, 67, "R2"));
            pane2.getChildren().add(r2);
            
            Rectangle r3 = new Rectangle(25, 90, 60, 30);
            r3.setArcWidth(15);
            r3.setArcHeight(25);
            
            pane2.getChildren().add(new Text(10, 107, "R3"));
            pane2.getChildren().add(r3);
            
            for (int i = 0; i < 4; i++) {
                Rectangle r = new Rectangle(100, 50, 100, 30);
                r.setRotate(i * 360 / 8);
                r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
                r.setFill(Color.WHITE);
                pane2.getChildren().add(r);
            }
            
            Stage stage3 = new Stage();
            Scene scene3 = new Scene(pane2, 250, 150);
            stage3.setTitle("Show Rectangle");
            stage3.setScene(scene3);
            stage3.show();
            
            Pane pane3 = new Pane();
            for (int i = 0; i < 16; i++) {
                Ellipse ellipse = new Ellipse(150, 100, 100, 50);
                ellipse.setStroke(Color.color(Math.random(), Math.random(), 
                        Math.random()));
                ellipse.setFill(Color.WHITE);
                ellipse.setRotate(i * 180 / 16);
                pane3.getChildren().add(ellipse);
            }
            
            Scene scene4 = new Scene(pane3, 300, 200);
            Stage stage4 = new Stage();
            stage4.setTitle("Show Ellipses");
            stage4.setScene(scene4);
            stage4.show();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}

class LinePane extends Pane{

    public LinePane(){
        
        Line line1 = new Line(10, 10, 10, 10);
        line1.endXProperty().bind(widthProperty().subtract(10));
        line1.endYProperty().bind(heightProperty().subtract(10));
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        
        getChildren().add(line1);
        
        Line line2 = new Line(10, 10, 10, 10);
        line2.startXProperty().bind(widthProperty().subtract(10));
        line2.endYProperty().bind(heightProperty().subtract(10));
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        
        getChildren().add(line2);
    }
}