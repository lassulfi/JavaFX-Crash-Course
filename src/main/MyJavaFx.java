/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.*;
import javafx.scene.control.Label;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author LuisDaniel
 */
public class MyJavaFx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        /*
        Button btnOk = new Button("OK!");
        Scene scene = new Scene(btnOk, 200, 250);
        primaryStage.setTitle("MyJavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();
        */
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(new Button("StackPane"));
        stackPane.setRotate(80);
        Scene scene = new Scene(stackPane, 200, 50);
        primaryStage.setTitle("StackPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();        
        
        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New stage"), 500, 600));
        stage.show();
        
        Font font1 = new Font("Times", 12);
        Font font2 = Font.font("Times New Roman", FontWeight.BOLD, 12);
        Font font3 = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 12.5);
        
        Pane pane = new Pane();
        Stage stage2 = new Stage();
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        /*
        circle.setCenterX(100);
        circle.setCenterY(100);
        */
        circle.setRadius(50);
        /*
        circle.setStroke(Color.LIGHTPINK);
        circle.setFill(Color.BLUE);
        */
        //circle.setStyle("-fx-stroke: black; -fx-fill:red;");
        
        Color color = new Color(0.25, 0.14, 0.333, 0.51);
        Color color2 = color.brighter();
        Color color3 = color2.darker();
        Color color4 = Color.color(0.33, 0.55, 0.879, 0.654);
        Color color5 = Color.rgb(1, 254, 57, 0.99);
        
        circle.setFill(Color.WHITE);
        
        Label label = new Label("JavaFX");
        label.setFont(font3);
        
        pane.getChildren().addAll(circle, label);
        
        Scene scene2 = new Scene(pane, 200, 200);
        stage2.setTitle("Show Circle");
        stage2.setScene(scene2);
        stage2.show();
        
        Stage stage3 = new Stage();
        Pane pane5 = new HBox(10);
        pane5.setPadding(new Insets(5, 5, 5, 5));
        Image image = new Image("http://www.onlinestores.com/media/catalog/category/american-flag-summary.jpg");
        pane5.getChildren().add(new ImageView(image));
        
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        
        pane5.getChildren().add(imageView2);
        
        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        
        pane5.getChildren().add(imageView3);
        
        Scene scene5 = new Scene(pane5);
        stage3.setTitle("Show Image");
        stage3.setScene(scene5);
        stage3.show();
    }
    
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    
}

//CSS reference for JavaFX
//http://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html
