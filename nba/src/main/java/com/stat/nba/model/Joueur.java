package com.stat.nba.model;



public class Joueur {
    String idJoueur;
    String nom;
    Equipe equipe;  
    
    public String getIdJoueur() {
        return this.idJoueur;
    }
    public String getNom() {
        return nom;
    }
    public Equipe getEquipe() {
        return equipe;
    }
    public void setIdJoueur(String id) throws Exception{
        if(id.length()>7){
            throw new Exception("idJoueur trop long");
        }
        this.idJoueur=id;
    }
    public void setNom(String nom) throws Exception{
        if(nom.length()==0 || nom==null){
            throw new Exception("nomJoueur nulle");
        }
        this.nom=nom;
    }
    public void setEquipe(Equipe equipe) throws Exception{
        if(equipe==null){
            throw new Exception("equipe indefini"+equipe);
        }else if(equipe instanceof Equipe ==false){
            throw new Exception("equipe invalide"+equipe.getClass().getName());
        }
        this.equipe=equipe;
    }
    public Joueur()throws Exception{}
    public Joueur(String id, String nom, Equipe e)throws Exception{
        this.setIdJoueur(id);
        this.setNom(nom);
        this.setEquipe(e);
    }
}
