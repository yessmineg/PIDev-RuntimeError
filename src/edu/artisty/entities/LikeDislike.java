/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artisty.entities;

/**
 *
 * @author User
 */
public class LikeDislike {

    private int idLikeDislike;
    //private Utilisateur user;
    private Article article;
    private Commentaire comment;
    private int idUser;
    private int idArticle;
    private int idCommentaire;
    private boolean isLike;

    public LikeDislike() {
        
    }

    public LikeDislike(int idUser, int idArticle, int idCommentaire, boolean isLike) {
        this.idUser = idUser;
        this.idArticle = idArticle;
        this.idCommentaire = idCommentaire;
        this.isLike = isLike;
    }
    

    public LikeDislike(int idLikeDislike, Article article, Commentaire comment, int idUser, int idArticle, int idCommentaire, boolean isLike) {
        this.idLikeDislike = idLikeDislike;
        this.article = article;
        this.comment = comment;
        this.idUser = idUser;
        this.idArticle = idArticle;
        this.idCommentaire = idCommentaire;
        this.isLike = isLike;
    }

    public LikeDislike(Article article, Commentaire comment, int idUser, int idArticle, int idCommentaire, boolean isLike) {
        this.article = article;
        this.comment = comment;
        this.idUser = idUser;
        this.idArticle = idArticle;
        this.idCommentaire = idCommentaire;
        this.isLike = isLike;
    }

 

    public int getIdLikeDislike() {
        return idLikeDislike;
    }

    public Article getArticle() {
        return article;
    }

    public Commentaire getComment() {
        return comment;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public int getIdCommentaire() {
        return idCommentaire;
    }

    public boolean isIsLike() {
        return isLike;
    }

    public void setIdLikeDislike(int idLikeDislike) {
        this.idLikeDislike = idLikeDislike;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void setComment(Commentaire comment) {
        this.comment = comment;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public void setIsLike(boolean isLike) {
        this.isLike = isLike;
    }
    public boolean isLike() {
        return isLike;
    }

    

    public void setLike(boolean like) {
        isLike = like;
    }
}
