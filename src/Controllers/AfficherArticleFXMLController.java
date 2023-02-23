package Controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import edu.artisty.entities.Article;
import edu.artisty.services.ArticleService;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
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
    
    ArticleService as = new ArticleService();

    @FXML
    private TextField content;
    @FXML
    private TextField title;
    @FXML
    private Button addbtn;
    @FXML
    private DatePicker date;
    @FXML
    private TextField image;
    @FXML
    private SplitMenuButton category;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addarticle(ActionEvent event) {
                
//         LocalDate localDate = date.getValue(); // get the selected date from the DatePicker
//    java.sql.Date sqlDate = java.sql.Date.valueOf(localDate); // convert the LocalDate to a java.sql.Date
//    
    Article a = new Article(title.getText(), content.getText(), image.getText(), category.getText(), 1);
    System.out.println(a);
    as.ajouter(a);
        
        
        
    }
    
    

    
    
}
