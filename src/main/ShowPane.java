/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Pos;

/**
 *
 * @author LuisDaniel
 */
public class ShowPane extends Application{
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Create a FlowPane
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);
        
        //Add the fields to the pane
        pane.getChildren().addAll(new Label("First Name"), new TextField(), 
                new Label("Middle Initial: "));
        TextField tfMiddleInitial = new TextField();
        tfMiddleInitial.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMiddleInitial, new Label("Last Name"), 
                new TextField());
        
        //Add the pane to the scene
        Scene scene = new Scene(pane, 200, 250);
        
        //Add the scene to the primaryStage
        primaryStage.setTitle("Show FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //Create a GridPane
        GridPane gridPane = new GridPane();
        Stage gridStage = new Stage();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);
    }
    
}
