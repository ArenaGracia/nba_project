package com.stat.nba.model;


public class Equipe {
    String idEquipe;
    String nom;
    
    public String getIdEquipe() {
        return idEquipe;
    }
    public String getNom() {
        return nom;
    }
    public void setIdEquipe(String id) throws Exception{
        if(id.length()>7){
            throw new Exception("idJoueur trop long");
        }
        this.idEquipe=id;
    }
    public void setNom(String nom) throws Exception{
        if(nom.length()==0 || nom==null){
            throw new Exception("nomJoueur nulle");
        }
        this.nom=nom;
    }
    public Equipe()throws Exception{}
    public Equipe(String id, String nom)throws Exception{
        this.setIdEquipe(id);
        this.setNom(nom);
    }
}
