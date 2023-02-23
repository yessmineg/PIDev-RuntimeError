/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artisty.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UploadPhotoController implements Initializable {

    @FXML
    private Button searchButton;
    @FXML
    private Label imageLabel;
    @FXML
    private ImageView imageView;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         
        String query = imageUrlTextField.getText();
        String clientId = "XlYRr50utPuUPut1JMr4T8Z8RR2OMrwi8gzjf6t05CU";
        String apiUrl = "https://api.unsplash.com/photos/random?query=" + query + "&client_id=" + clientId;

       try {
    Image image = new Image(apiUrl);
    ImageView imageView = new ImageView(image);
    imageLabel.setGraphic(imageView);
} catch (Exception e) {
    e.printStackTrace();
}
    }    
    
}
