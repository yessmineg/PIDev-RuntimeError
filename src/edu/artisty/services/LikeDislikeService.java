/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artisty.services;

import edu.artisty.entities.LikeDislike;
import edu.artisty.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class LikeDislikeService implements IService<LikeDislike> {

    Connection cnx = DataSource.getInstance().getCnx();
    @Override
    public void ajouter(LikeDislike likeDislike) {

        String query = "INSERT INTO likedislike (id_user, id_article,id_commentaire ,is_like) VALUES (?, ?, ?,?)";
        try {
            PreparedStatement ste = cnx.prepareStatement(query);
            ste.setInt(1, likeDislike.getIdUser());
            ste.setInt(2, likeDislike.getIdArticle());
            ste.setInt(3, likeDislike.getIdCommentaire());
            ste.setBoolean(4, likeDislike.isLike());
            ste.executeUpdate();
            System.out.println("like Added Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
public void supprimer(int idLikeDislike) {
    String query = "DELETE FROM likedislike WHERE id_like_dislike = ?";
       
    
    try {
        try (PreparedStatement stmt = cnx.prepareStatement(query)) {
            stmt.setInt(1, idLikeDislike);
            stmt.executeUpdate();
        }
        
    } catch (SQLException e) {
                    System.out.println(e.getMessage());
    }
}

//@Override
//public void modifier(LikeDislike likeDislike) {
//    try {
//        String query = "UPDATE likedislike SET id_utilisateur = ?, id_article = ?, id_commentaire = ?, is_like = ? WHERE id_like_dislike = ?";
//        try (PreparedStatement stmt = cnx.prepareStatement(query)) {
//            stmt.setInt(1, likeDislike.getIdUser());
//            stmt.setInt(2, likeDislike.getIdArticle());
//            stmt.setInt(3, likeDislike.getIdCommentaire());
//            stmt.setBoolean(4, likeDislike.isLike());
//            stmt.setInt(5, likeDislike.getIdLikeDislike());
//            stmt.executeUpdate();
//        }
//    } catch (SQLException e) {
//    }
//}

@Override
public List<LikeDislike> getAll() {
    List<LikeDislike> likeDislikes = new ArrayList<>();
    try {
        String query = "SELECT * FROM likedislike";
        try (Statement stmt = cnx.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                LikeDislike likeDislike = new LikeDislike();
                likeDislike.setIdLikeDislike(rs.getInt("id_like_dislike"));
                likeDislike.setIdUser(rs.getInt("id_utilisateur"));
                likeDislike.setIdArticle(rs.getInt("id_article"));
                likeDislike.setIdCommentaire(rs.getInt("id_commentaire"));
                likeDislike.setLike(rs.getBoolean("is_like"));
                likeDislikes.add(likeDislike);
            }
            rs.close();
        }
    } catch (SQLException e) {
    }
    return likeDislikes;
}

@Override
public LikeDislike getOneById(int id) {
    LikeDislike likeDislike = null;
    try {
        String query = "SELECT * FROM likedislike WHERE id_like_dislike = ?";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            likeDislike = new LikeDislike();
            likeDislike.setIdLikeDislike(rs.getInt("id_like_dislike"));
            likeDislike.setIdUser(rs.getInt("id_utilisateur"));
            likeDislike.setIdArticle(rs.getInt("id_article"));
            likeDislike.setIdCommentaire(rs.getInt("id_commentaire"));
            likeDislike.setLike(rs.getBoolean("is_like"));
        }
        rs.close();
        stmt.close();
    } catch (SQLException e) {
    }
    return likeDislike;
}

    @Override
    public void modifier(LikeDislike p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
