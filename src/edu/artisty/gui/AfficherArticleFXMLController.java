/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artisty.gui;

        import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import edu.artisty.entities.Article;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AfficherArticleFXMLController implements Initializable {

    @FXML
    private DatePicker date;
    @FXML
    private Button addbtn;
   // private TextField imageLabel;
    @FXML
    private TextField content;
    @FXML
    private Button searchButton;
    @FXML
    private TextField title;
    @FXML
    private SplitMenuButton category;
    
     private TextField imageUrlTextField;
    @FXML 
    private Label imageLabel;
    @FXML
    private ImageView imageView;

    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addarticle(ActionEvent event) {
        
        
//    LocalDate localDate = date.getValue(); // get the selected date from the DatePicker
//    java.sql.Date sqlDate = java.sql.Date.valueOf(localDate); // convert the LocalDate to a java.sql.Date
    
    Article a = new Article(title.getText(), content.getText(), .getText(), category.getText(), 1);
    System.out.println(a);
    as.ajouter(a);

   
    }
}

                
     
//        
        
        
        


