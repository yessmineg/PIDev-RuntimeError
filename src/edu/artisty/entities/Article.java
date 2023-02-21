/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artisty.entities;

import java.sql.Date;

/**
 *
 * @author MariemKhlifi
 */
public class Article {

    public static Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int idArticle;
    private String titreArticle;
    private Date dateArticle;
    private String contentArticle;
    private int nbrLikesArticle;
    private String imageArticle;
    private String categoryArticle;
    // TODO
    private int idUser;
    private int nbrviewsArticle;

    public Article() {
    }

    public Article(int idArticle, String titreArticle, Date dateArticle, String contentArticle, int nbrLikesArticle, String imageArticle, String categoryArticle, int idUser, int nbrviewsArticle) {
        this.idArticle = idArticle;
        this.titreArticle = titreArticle;
        this.dateArticle = dateArticle;
        this.contentArticle = contentArticle;
        this.nbrLikesArticle = nbrLikesArticle;
        this.imageArticle = imageArticle;
        this.categoryArticle = categoryArticle;
        this.idUser = idUser;
        this.nbrviewsArticle = nbrviewsArticle;
    }

    public Article(String titreArticle, Date dateArticle, String contentArticle, int nbrLikesArticle, String imageArticle, String categoryArticle, int idUser, int nbrviewsArticle) {
        this.titreArticle = titreArticle;
        this.dateArticle = dateArticle;
        this.contentArticle = contentArticle;
        this.nbrLikesArticle = nbrLikesArticle;
        this.imageArticle = imageArticle;
        this.categoryArticle = categoryArticle;
        this.idUser = idUser;
        this.nbrviewsArticle = nbrviewsArticle;
    }

    public Article(String titreArticle, String contentArticle, String imageArticle, String categoryArticle, int idUser) {
        this.titreArticle = titreArticle;
        
        this.contentArticle = contentArticle;
        this.imageArticle = imageArticle;
        this.categoryArticle = categoryArticle;
        this.idUser = idUser;
    }

   

    public int getIdArticle() {
        return idArticle;
    }

    public String getTitreArticle() {
        return titreArticle;
    }

    public Date getDateArticle() {
        return dateArticle;
    }

    public String getContentArticle() {
        return contentArticle;
    }

    public int getNbrLikesArticle() {
        return nbrLikesArticle;
    }

    public String getImageArticle() {
        return imageArticle;
    }

    public String getCategoryArticle() {
        return categoryArticle;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getNbrviewsArticle() {
        return nbrviewsArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public void setTitreArticle(String titreArticle) {
        this.titreArticle = titreArticle;
    }

    public void setDateArticle(Date dateArticle) {
        this.dateArticle = dateArticle;
    }

    public void setContentArticle(String contentArticle) {
        this.contentArticle = contentArticle;
    }

    public void setNbrLikesArticle(int nbrLikesArticle) {
        this.nbrLikesArticle = nbrLikesArticle;
    }

    public void setImageArticle(String imageArticle) {
        this.imageArticle = imageArticle;
    }

    public void setCategoryArticle(String categoryArticle) {
        this.categoryArticle = categoryArticle;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setNbrviewsArticle(int nbrviewsArticle) {
        this.nbrviewsArticle = nbrviewsArticle;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.idArticle;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        if (this.idArticle != other.idArticle) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Article{" + "idArticle=" + idArticle + ", titreArticle=" + titreArticle + ", dateArticle=" + dateArticle + ", contentArticle=" + contentArticle + ", nbrLikesArticle=" + nbrLikesArticle + ", imageArticle=" + imageArticle + ", categoryArticle=" + categoryArticle + ", idUser=" + idUser + ", nbrviewsArticle=" + nbrviewsArticle + '}';
    }
    
    

   

}
