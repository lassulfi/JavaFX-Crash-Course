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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author LuisDaniel
 */
public class ShowPane extends Application{
    
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
        Stage paneStage = new Stage();
        paneStage.setTitle("Show FlowPane");
        paneStage.setScene(scene);
        paneStage.show();
        
        //Create a GridPane
        GridPane gridPane = new GridPane();
        Stage gridStage = new Stage();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);
        
        //Add elements to the gridPane
        gridPane.add(new Label("First name: "),0 ,0);
        gridPane.add(new TextField(),1 ,0);
        gridPane.add(new Label("Middle Initial"), 0, 1);
        gridPane.add(new TextField(), 1, 1);
        gridPane.add(new Label("Last Name: "), 0, 2);
        gridPane.add(new TextField(), 1, 2);
        
        //Add a new Button and set it's alignement to right position
        Button btAdd = new Button("Add name");  
        gridPane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        
        Scene gridScene = new Scene(gridPane, 200, 250);
        gridStage.setTitle("ShowGridPane");
        gridStage.setScene(gridScene);
        gridStage.show();
        
        //Create a BorderPane Layout
        Stage borderStage = new Stage();
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new CustomPane("Top"));
        borderPane.setRight(new CustomPane("Right"));
        borderPane.setBottom(new CustomPane("Bottom"));
        borderPane.setLeft(new CustomPane("Left"));
        borderPane.setCenter(new CustomPane("Center"));
        
        Scene borderScene = new Scene(borderPane);
        borderStage.setTitle("ShowBorderPane");
        borderStage.setScene(borderScene);
        borderStage.show();
        
        Stage boxStage = new Stage();
        BorderPane boxPane = new BorderPane();
        
        boxPane.setTop(getHBox());
        boxPane.setLeft(getVBox());
        
        Scene boxScene = new Scene(boxPane);
        boxStage.setTitle("ShowHBoxVBox");
        boxStage.setScene(boxScene);
        boxStage.show();
        
    } 
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /**
     * Creates and returns a custom HBox
     * @return HBox
     */
    private HBox getHBox(){
        
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: color");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        
        ImageView imageView = new ImageView(new Image("http://www.onlinestores.com/media/catalog/category/american-flag-summary.jpg"));
        hBox.getChildren().add(imageView);
        
        return hBox;
    }
    
    private VBox getVBox(){
        
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.getChildren().add(new Label("Courses: "));
        
        Label[] courses = {new Label("CSCI 1301"),
                            new Label("CSCI 1302"),
                            new Label("CSCI 2410"),
                            new Label("CSCI 3720")};
                            
        for(Label course: courses){
            vBox.setMargin(course, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(course);
        }
        
        return vBox;
    }
}

/**
 * A classe abaixo cria um pane customizado, dessa maneira evitamos a repetição
 * de código
 * @author LuisDaniel
 */
class CustomPane extends StackPane{
    
    //Métodos especiais
    //Construtor
    public CustomPane(String title){
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: red;");
        setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    }
}
