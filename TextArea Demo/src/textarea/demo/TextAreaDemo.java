/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textarea.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;

/**
 *
 * @author Abel
 */
public class TextAreaDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TextArea txtNote = new TextArea("This is text area");
        txtNote.setPrefColumnCount(20);
        txtNote.setPrefRowCount(5);
        txtNote.setStyle("-fx-text-fill: red");
        txtNote.setFont(Font.font("Times",20));
        ScrollPane sp = new ScrollPane(txtNote);
        StackPane root = new StackPane();
        root.getChildren().add(sp);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
