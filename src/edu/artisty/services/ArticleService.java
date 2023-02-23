/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artisty.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.artisty.entities.Article;
import edu.artisty.utils.DataSource;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


/**
 *
 * @author MariemKhlifi
 */
public class ArticleService implements IService<Article> {

    Connection cnx = DataSource.getInstance().getCnx();


    @Override
    public void ajouter(Article article) {
        String query = "INSERT INTO ARTICLE(titre_article,date_article,content_article,nbr_likes_article,image_article,category_article,id_user,nbr_views_article) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ste = cnx.prepareStatement(query);
            ste.setString(1, article.getTitreArticle());
            ste.setDate(2, article.getDateArticle());
            ste.setString(3, article.getContentArticle());
            ste.setInt(4, article.getNbrLikesArticle());
            ste.setString(5, article.getImageArticle());
            ste.setString(6, article.getCategoryArticle());
            ste.setInt(7, article.getIdUser());
            ste.setInt(8, article.getNbrviewsArticle());
            ste.executeUpdate();
            System.out.println("Article Added Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        // Vérifier que les champs ne sont pas nuls et respectent une longueur minimale
    if (article.getTitreArticle().isEmpty()) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Champ manquant");
        alert.setHeaderText(null);
        alert.setContentText("Le champ titre ne doit pas être vide");
        alert.showAndWait();
        return;
    }
    
    
//   Date dateString = article.getDateArticle();
//if (!isValidDate(dateString)) {
//    Alert alert = new Alert(AlertType.WARNING);
//    alert.setTitle("Champ invalide");
//    alert.setHeaderText(null);
//    alert.setContentText("La date de l'article n'est pas valide. Veuillez saisir une date au format dd/MM/yyyy.");
//    alert.showAndWait();
//    return;
//}
// The input date is valid, do something


    if (article.getContentArticle().isEmpty()) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Champ manquant");
        alert.setHeaderText(null);
        alert.setContentText("Le champ contenu ne doit pas être vide");
        alert.showAndWait();
        return;
    }
     if (article.getImageArticle() .isEmpty()) {
    Alert alert = new Alert(AlertType.WARNING);
    alert.setTitle("Champ manquant");
    alert.setHeaderText(null);
    alert.setContentText("L'image de l'article ne doit pas être vide");
    alert.showAndWait();
    return;
}
      if (article.getCategoryArticle().isEmpty()) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Champ manquant");
        alert.setHeaderText(null);
        alert.setContentText("Le categorie doit être selectionné");
        alert.showAndWait();
        return;
    }
    

    // Vérifier que les champs respectent une longueur maximale
    int titleMaxLen = 50; 
    
    int contentMaxLen = 500;
    if (article.getTitreArticle().length() > titleMaxLen) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Champ trop long");
        alert.setHeaderText(null);
        alert.setContentText("Le champ titre ne doit pas dépasser " + titleMaxLen + " caractères");
        alert.showAndWait();
        return;
    }
    if (article.getContentArticle().length() > contentMaxLen) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Champ trop long");
        alert.setHeaderText(null);
        alert.setContentText("Le champ contenu ne doit pas dépasser " + contentMaxLen + " caractères");
        alert.showAndWait();
        return;
    }

String sql = "INSERT INTO article (titre_article,date_article,content_article,image_article,category_article,id_user) VALUES (?, ?, ?, ?, ?, ?)";
try (PreparedStatement statement = cnx.prepareStatement(sql)) {
    statement.setString(1, article.getTitreArticle());
     statement.setDate(2, article.getDateArticle());
    statement.setString(3, article.getContentArticle());
    statement.setString(4, article.getImageArticle());
     statement.setString(5, article.getCategoryArticle());
    statement.setInt(6, article.getIdUser());


   
   
        int rowsAffected = statement.executeUpdate();
        if (rowsAffected > 0) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Article ajouté");
            alert.setHeaderText(null);
            alert.setContentText("L'article a été ajouté avec succès");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("L'ajout de l'article a échoué");
            alert.showAndWait();
        }
    } catch (SQLException ex) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erreur");
        alert.setHeaderText(null);
        alert.setContentText("Erreur lors de l'ajout de l'article: " + ex.getMessage());
        alert.showAndWait();
    }
    }
    
    @Override
    public void modifier(Article article) {
        String query = "UPDATE ARTICLE SET titre_article = '" + article.getTitreArticle() + "', date_article= '"
                + article.getDateArticle() + "', content_article= '" + article.getContentArticle() + "', nbr_likes_article= '"
                + article.getNbrLikesArticle() + "', image_article= '" + article.getImageArticle() + "', category_article= '"
                + article.getCategoryArticle() + "', nbr_views_article= '" + article.getNbrviewsArticle() + "' , WHERE id_article = " + article.getIdArticle() + "";
        try {
            Statement ste = cnx.createStatement();
            ste.executeUpdate(query);
            System.out.println("Article Updated Successfully ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void supprimer(int idArticle) {
        String query = "DELETE FROM ARTICLE WHERE id_article = " + idArticle + "";
        try {
            Statement ste = cnx.createStatement();
            ste.executeUpdate(query);
            System.out.println("Article Deleted Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Article> getAll() {
        List<Article> listeArticles = new ArrayList<>();
        String query = "SELECT * FROM ARTICLE";
        try {
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(query);
            while (rs.next()) {
                Article article = new Article();
                article.setIdArticle(rs.getInt("id_article"));
                article.setTitreArticle(rs.getString("titre_article"));
                article.setDateArticle(rs.getDate("date_article"));
                article.setContentArticle(rs.getString("content_article"));
                article.setNbrLikesArticle(rs.getInt("nbr_likes_article"));
                article.setImageArticle(rs.getString("image_article"));
                article.setCategoryArticle(rs.getString("category_article"));
                article.setIdUser(rs.getInt("id_user"));
                article.setNbrviewsArticle(rs.getInt("nbr_views_article"));
                listeArticles.add(article);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return listeArticles;
    }

    @Override
    public Article getOneById(int idArticle) {
        String query = "SELECT * FROM ARTICLE WHERE id_article = " + idArticle + "";
        Article article = new Article();
        try {
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(query);
            while (rs.next()) {
                article.setIdArticle(rs.getInt("id_article"));
                article.setTitreArticle(rs.getString("titre_article"));
                article.setDateArticle(rs.getDate("date_article"));
                article.setContentArticle(rs.getString("content_article"));
                article.setNbrLikesArticle(rs.getInt("nbr_likes_article"));
                article.setImageArticle(rs.getString("image_article"));
                article.setCategoryArticle(rs.getString("category_article"));
                article.setIdUser(rs.getInt("id_user"));
                article.setNbrviewsArticle(rs.getInt("nbr_views_article"));

            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return article;
    }

    public boolean afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   

    


    
    
    //*****************************chercher selon titre ou category ************************************//

    public List<Article> chercherArticle(String title, String category) {
        List<Article> articles = getAll();

        Stream<Article> filteredStream = articles.stream();

        if (title != null && !title.isEmpty()) {
            filteredStream = filteredStream.filter(article -> article.getTitreArticle().toLowerCase().contains(title.toLowerCase()));
        }

        if (category != null && !category.isEmpty()) {
            filteredStream = filteredStream.filter(article -> article.getCategoryArticle().toLowerCase().equals(category.toLowerCase()));
        }

        return filteredStream.collect(Collectors.toList());
    }
    
    
       //**************************chercher selon categorie **************************************//
    public List<Article> chercherArticleParCategorie(String categorie) {
        List<Article> articles = new ArrayList<>();
        try {
            String query = "SELECT * FROM article WHERE category_article = ?";
            PreparedStatement ps = cnx.prepareStatement(query);
            ps.setString(1, categorie);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Article article = new Article();
                article.setIdArticle(rs.getInt("id_article"));
                article.setTitreArticle(rs.getString("titre_article"));
                article.setDateArticle(rs.getDate("date_article"));
                article.setContentArticle(rs.getString("content_article"));
                article.setNbrLikesArticle(rs.getInt("nbr_likes_article"));
                article.setImageArticle(rs.getString("image_article"));
                article.setCategoryArticle(rs.getString("category_article"));
                article.setIdUser(rs.getInt("id_user"));
                article.setNbrviewsArticle(rs.getInt("nbr_views_article"));

                articles.add(article);
            }
        } catch (SQLException ex) {
        }
        return articles.stream()
                .filter(a -> a.getCategoryArticle().equals(categorie))
                .collect(Collectors.toList());
    }


    //*************filtrage3*************************//
    public void filtrerMotsInappropries() {
        List<String> motsInappropries = Arrays.asList("drogue", "violence", "crime", "kill");

        // Récupérer tous les articles
        List<Article> articles = getAll();

        // Parcourir chaque article et filtrer les mots inappropriés
        articles.forEach(article -> {
            String content = article.getContentArticle();
            for (String mot : motsInappropries) {
                String remplacement = "";
                for (int i = 0; i < mot.length(); i++) {
                    remplacement += "*";
                }
                content = content.replaceAll(mot, remplacement);
            }
            article.setContentArticle(content);

            // Mettre à jour l'article dans la base de données
            String query = "UPDATE ARTICLE SET content_article = ? WHERE id_article = ?";
            try {
                PreparedStatement ps = cnx.prepareStatement(query);
                ps.setString(1, article.getContentArticle());
                ps.setInt(2, article.getIdArticle());
                ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        });

        System.out.println("Mots inappropriés filtrés avec succès");
    }
    //******************************************************************//
    
     public String LoadIMG(Article article) throws SQLException {
        String rq="SELECT * from Article where id_article= '" + article.getIdArticle() + "'";
        // System.out.println(rq);
        try {
            PreparedStatement ste = cnx.prepareStatement(rq);
            ResultSet rs = ste.executeQuery(rq);
            while (rs.next()) {
                String path=rs.getString("image_article");
                return path;
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private boolean isValidDate(Date dateString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

