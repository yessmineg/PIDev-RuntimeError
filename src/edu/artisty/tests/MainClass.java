/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artisty.tests;

import edu.artisty.services.ArticleService;
import edu.artisty.services.CommentaireService;
import edu.artisty.utils.DataSource;
import java.sql.Date;
import edu.artisty.entities.Article;
import edu.artisty.entities.LikeDislike;
import edu.artisty.services.LikeDislikeService;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author MariemKhlifi
 */
public class MainClass {

    public static void main(String[] args) throws SQLException {

        DataSource ds = DataSource.getInstance();

      // Article article = new Article();
     //   Article article = new Article(5, "new article",Date.valueOf("2023-02-07"), "violence, crime et autre ", 3, "image", "livre", 3,6);
      ArticleService a = new ArticleService();
        
       a.filtrerMotsInappropries();

       // a.ajouter(article);
        // a.supprimer(3);
        // ArticleService dao = new ArticleService(); // replace with your DAO class
        
        
        
        //*******************************autre recherche*****************************//
        
       // List<Article> results = a.chercherArticle(null,"livre");

        
        
        //***********************chercher selon titre ou categorie*****fonctionnel************************//
        
//////        
//        ArticleService articleService = new ArticleService();
//List<Article> articles = articleService.chercherArticle( null,"Category A");
//
//articles.forEach((Article article1) -> {
//    System.out.println(article1.toString());
//        }); 



//****************************LikeDislike************fonctionnel************************//
        // Créer une instance de LikeDislikeService
        //  LikeDislikeService likeDislikeService = new LikeDislikeService();
        // Ajouter un nouveau like/dislike
        // LikeDislike likeDislike = new LikeDislike(1,2, 3, true);
        // likeDislikeService.ajouter(likeDislike);
//        // **Modifier un like/dislike existant
//        LikeDislike likeDislikeModifie = likeDislikeService.getOneById(1);
//        likeDislikeModifie.setLike(false);
//        likeDislikeService.modifier(likeDislikeModifie);
        // **Supprimer un like/dislike existant
        // likeDislikeService.supprimer(2);
        //** Récupérer tous les likes/dislikes existants
//        List<LikeDislike> likeDislikes = likeDislikeService.getAll();
//        for (LikeDislike ld : likeDislikes) {
//            System.out.println(ld.toString());
//        }
        //** Récupérer un like/dislike par son ID
//        LikeDislike likeDislikeById = likeDislikeService.getOneById(1);
//        System.out.println(likeDislikeById.toString());
//    
        //********************test filtrage1**************************//
//    // Créer une chaîne de caractères pour tester la méthode
//    String contenu = "Cet article parle de violence et de drogue, ce qui est inapproprié.";
//
//    // Filtrer les mots inappropriés
//    String contenuFiltre = articleService.filtrerMotsInappropries(contenu);
//
//    // Afficher le contenu filtré
//    System.out.println(contenuFiltre);

        /**************************chercherArticle***********************/
        // Instanciation du service ArticleService
//        ArticleService articleService = new ArticleService();
//
//         //Utilisation de la méthode chercherArticleParCategorie pour chercher les articles de la catégorie "livre"
//        List<Article> articles = articleService.chercherArticleParCategorie("Category A");
//
//         //Affichage des articles trouvés
//        articles.forEach((article) -> {
//            System.out.println(article.toString());
//        });
        //////////////////////////////////////////
        //articleService.ajouter(article);
        //  Article article = new Article(3,"mariemkl",Date.valueOf("2023-02-07"),"hello",0,"image","livre",1);
        //ArticleService articleService = new ArticleService();
        //System.out.println(articleService.getOneById(3));
        // System.out.println(articleService.getAll());
        // articleService.supprimer(2);
        //articleService.modifier(new Article(3,"emnouch",Date.valueOf("2023-02-07"),"hello",0,"image","livre",1));
        // *******************
        // CommentaireService commentaireService = new CommentaireService();
        // Article article = new Article();
        // Commentaire c = new Commentaire(6, article, "contentCommentaire", Date.valueOf("2023-02-07"), 2, true, 1);
        // commentaireService.ajouter(c);
        //commentaireService.modifier(c);
        //commentaireService.supprimer(2);
        
        
        
        
        
        
        //********************test filtrage1**************************//
       
        
        
//    // Créer une chaîne de caractères pour tester la méthode
//    String contenu = "Cet article parle de violence et de drogue, ce qui est inapproprié.";
//
//    // Filtrer les mots inappropriés
//    String contenuFiltre = ArticleService.filtrerMotsInappropries(contenu);
//
//    // Afficher le contenu filtré
//    System.out.println(contenuFiltre);
//

        
        
        
        /**************************chercherArticle***********************/

        // Instanciation du service ArticleService  
//        ArticleService articleService = new ArticleService();
//        
//         //Utilisation de la méthode chercherArticleParCategorie pour chercher les articles de la catégorie "livre"
//        List<Article> articles = articleService.chercherArticleParCategorie("Category A");
//        
//         //Affichage des articles trouvés
//        articles.forEach((article) -> {
//            System.out.println(article.toString());
//        });
    



        //////////////////////////////////////////
        
        
        
        //articleService.ajouter(article);
        //  Article article = new Article(3,"mariemkl",Date.valueOf("2023-02-07"),"hello",0,"image","livre",1);
        //ArticleService articleService = new ArticleService();
        //System.out.println(articleService.getOneById(3));
         System.out.println(a.getAll());
        // articleService.supprimer(2);
        //articleService.modifier(new Article(3,"emnouch",Date.valueOf("2023-02-07"),"hello",0,"image","livre",1));
        
        
        // *******************
        // CommentaireService commentaireService = new CommentaireService();
        // Article article = new Article();
        // Commentaire c = new Commentaire(6, article, "contentCommentaire", Date.valueOf("2023-02-07"), 2, true, 1);
        // commentaireService.ajouter(c);
        //commentaireService.modifier(c);
        //commentaireService.supprimer(2);
    }
    

}
