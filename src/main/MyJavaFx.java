/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
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
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("StackPane"));
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("StackPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New stage"), 500, 600));
        stage.show();
    }
    
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    
}
