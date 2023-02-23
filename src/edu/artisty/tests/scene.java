/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artisty.tests;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
 

/**
 *
 * @author User
 */
public class scene extends Application{
    
    
    
 
 public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../gui/AfficherArticleFXML.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root,1280,700);
        primaryStage.setScene(scene);
        primaryStage.show();
       
     
    }
}

        
    

    



