/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author User
 */
public class GestionBlogArticleCardController implements Initializable {

    @FXML
    private Label titre;
    @FXML
    private Label categorie;
    @FXML
    private Label contenu;
    @FXML
    private Label nom;
    @FXML
    private Label date;
    @FXML
    private TextArea commentaire;
    @FXML
    private Label id;
    @FXML
    private HBox commentaireCardLayout;
    @FXML
    private ScrollPane commentaireScrollPane;
    @FXML
    private GridPane commentaireGridPane;
    @FXML
    private Button GetData;
    @FXML
    private Label success;
    @FXML
    private Label warning;
    @FXML
    private Label idU;
    @FXML
    private Button reload;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addC(ActionEvent event) {
    }

    @FXML
    private void GetData(ActionEvent event) {
    }

    @FXML
    private void showComment(ActionEvent event) {
    }
    
}
